package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.enums.Status;
import kg.mega.natv_final_project.mappers.OrderMapper;
import kg.mega.natv_final_project.models.dto.crud.OrderDto;
import kg.mega.natv_final_project.models.dto.requests.request3.ChannelsListReqDto;
import kg.mega.natv_final_project.models.dto.requests.request3.OrderReqDto;
import kg.mega.natv_final_project.models.dto.responses.response3.ChannelsListResDto;
import kg.mega.natv_final_project.models.dto.responses.response3.OrderResDto;
import kg.mega.natv_final_project.models.entities.Order;
import kg.mega.natv_final_project.models.entities.Text;
import kg.mega.natv_final_project.repositories.OrderRepo;
import kg.mega.natv_final_project.repositories.PriceRepo;
import kg.mega.natv_final_project.repositories.TextAddRepo;
import kg.mega.natv_final_project.services.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Component
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;
    private final TextAddRepo textAddRepo;
    private final PriceRepo priceRepo;


    public OrderServiceImpl(OrderRepo orderRepo,
                            TextAddRepo text_addRepo, PriceRepo priceRepo) {
        this.orderRepo = orderRepo;

        this.textAddRepo = text_addRepo;
        this.priceRepo = priceRepo;
    }

    @Override
    public OrderDto crudSave(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        orderRepo.save(order);
        return orderDto;
    }

    @Override
    public Order findById(Long id) {

        return null;
    }

    @Override
    public OrderResDto save(OrderReqDto orderReqDto) {
        Text text = Text.prepareString(orderReqDto.getText());
        Order order = new Order();
        order.setClientFIO(orderReqDto.getClientFIO());
        order.setClientPhone(orderReqDto.getClientPhone());
        order.setClientEmail(orderReqDto.getClientEmail());
        text = textAddRepo.save(text);
        order.setTextAdd(text);
        List<ChannelsListReqDto> channels = orderReqDto.getChannels();
        Text finalText = text;
        List<ChannelsListResDto> channelsListResDto = channels.stream()
                .map((chl) -> {
                    double price = (finalText.getSymbolCount()
                            * priceRepo.getPricePerSymbol(chl.getChannelId()))
                            * chl.getDays().stream().count();

                    ChannelsListResDto channelsListResDtos  = new ChannelsListResDto();
                    channelsListResDtos.setChannelId(chl.getChannelId());
                    channelsListResDtos.setPrice(price);
                    //double priceWithDiscount = price - price * 0.1;
                    if(chl.getDays().stream().count() >= 3 && chl.getDays().stream().count() < 7){
                        channelsListResDtos.setPriceWithDiscount(price - price * 0.05);
                    }
                    if (chl.getDays().stream().count() >= 7 && chl.getDays().stream().count() < 10){
                        channelsListResDtos.setPriceWithDiscount(price - price * 0.1);
                    }
                    if(chl.getDays().stream().count() >= 10){
                        channelsListResDtos.setPriceWithDiscount(price - price * 0.15);
                    }
                    //channelsListResDtos.setPriceWithDiscount(priceWithDiscount);
                    order.setOrderSum( order.getOrderSum() + price);
                    channelsListResDtos.setDays(chl.getDays());
                    return  channelsListResDtos;
                }).collect(Collectors.toList());
        double totalPrice = order.getOrderSum();
        orderRepo.save(order);
        OrderResDto orderResDto = new OrderResDto();
        orderResDto.setText(order.getTextAdd().getText());
        orderResDto.setClientFIO(order.getClientFIO());
        orderResDto.setClientPhone(order.getClientPhone());
        orderResDto.setClientEmail(order.getClientEmail());
        orderResDto.setStatus(Status.CREATED);
        orderResDto.setTotalPrice(totalPrice);
        orderResDto.setChannels(channelsListResDto);

        return orderResDto;
    }
}
