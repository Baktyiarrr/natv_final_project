package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.OrderMapper;
import kg.mega.natv_final_project.models.dto.requests.OrderDto;
import kg.mega.natv_final_project.models.entities.Order;
import kg.mega.natv_final_project.repositories.OrderRepo;
import kg.mega.natv_final_project.services.OrderService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
@Service
public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo;


    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;

    }

    @Override
    public OrderDto save(OrderDto orderDto) {
        Order order = OrderMapper.INSTANCE.orderDtoToOrder(orderDto);
        order = orderRepo.save(order);

        return orderDto;
    }
}
