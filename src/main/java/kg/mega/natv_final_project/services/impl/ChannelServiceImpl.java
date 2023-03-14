package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.ChannelMapper;
import kg.mega.natv_final_project.models.dto.crud.ChannelDto;
import kg.mega.natv_final_project.models.dto.responses.response1.ChannelListDto;
import kg.mega.natv_final_project.models.dto.responses.response1.DiscountListDto;
import kg.mega.natv_final_project.models.entities.Channel;
import kg.mega.natv_final_project.models.entities.Discount;
import kg.mega.natv_final_project.repositories.ChannelRepo;
import kg.mega.natv_final_project.repositories.DiscountRepo;
import kg.mega.natv_final_project.repositories.PriceRepo;
import kg.mega.natv_final_project.services.ChannelService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    private final ChannelRepo channelRepo;
    private final PriceRepo priceRepo;
    private final DiscountRepo discountRepo;



    public ChannelServiceImpl(ChannelRepo channelRepo, PriceRepo priceRepo, DiscountRepo discountRepo) {
        this.channelRepo = channelRepo;

        this.priceRepo = priceRepo;
        this.discountRepo = discountRepo;
    }

    @Override
    public List<ChannelListDto> findAll() {
        List<ChannelListDto> channelListDtos = new ArrayList<>();
        List<Channel> channels = channelRepo.findAllByChannelStatus();
        for (Channel i:channels) {
            ChannelListDto channelListDto = new ChannelListDto();
            channelListDto.setChannelName(i.getChannelName());
            channelListDto.setLogoPath(i.getLogoPath());
            if(priceRepo.getPriceById(i.getChannelId()) != null){
                if (getDiscountsById(i.getChannelId()) != null){
                    channelListDto.setPricePerSymbol(priceRepo.getPriceById(i.getChannelId()).getPricePerSymbol());
                    channelListDto.setDiscounts(getDiscountsById(i.getChannelId()));
                }
            }
            channelListDtos.add(channelListDto);
        }
       return channelListDtos;
    }
    public List<DiscountListDto> getDiscountsById(Long id){
        List<Discount> discounts = discountRepo.getDiscountsById(id);
        List<DiscountListDto> discountListDtos = new ArrayList<>();
        for (Discount i: discounts) {
            if (i.getStartDate().before(new Date()) &&
            i.getEndDate().after(new Date())){
                DiscountListDto discountListDto = new DiscountListDto();
                discountListDto.setDiscount(i.getDiscount());
                discountListDto.setFromDayCount(i.getFromDayCount());
                discountListDtos.add(discountListDto);
            }
        }
        return discountListDtos;

    }

    @Override
    public ChannelDto save(ChannelDto channelDto) {
        Channel channel = ChannelMapper.INSTANCE.channelDtoToChannel(channelDto);
        channel = channelRepo.save(channel);
        /*channelDto.setChannelId(channel.getChannelId());*/
        return channelDto;
    }

    @Override
    public Channel findById(Long channelId) {
        return channelRepo.findById(channelId).orElseThrow(()->{
             return new RuntimeException("Такого канала не существует!");
        });
    }

    @Override
    public ChannelDto update(ChannelDto channelDto) {
        Channel existingChannel = channelRepo.findById(channelDto.getChannelId()).orElseThrow(()->{
            return new RuntimeException("Такого канала не существует!");
        });
        existingChannel = ChannelMapper.INSTANCE.channelDtoToChannel(channelDto);
        //update id is not null
        channelRepo.save(existingChannel);
        return channelDto;
    }
}
