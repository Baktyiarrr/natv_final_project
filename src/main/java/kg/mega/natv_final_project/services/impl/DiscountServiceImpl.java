package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.DiscountMapper;
import kg.mega.natv_final_project.models.dto.crud.DiscountDto;
import kg.mega.natv_final_project.models.entities.Discount;
import kg.mega.natv_final_project.repositories.ChannelRepo;
import kg.mega.natv_final_project.repositories.DiscountRepo;
import kg.mega.natv_final_project.services.DiscountService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class DiscountServiceImpl implements DiscountService {
    private final DiscountRepo discountRepo;
    private final ChannelRepo channelRepo;

    public DiscountServiceImpl(DiscountRepo discountRepo, ChannelRepo channelRepo) {
        this.discountRepo = discountRepo;
        this.channelRepo = channelRepo;
    }

    @Override
    public DiscountDto save(DiscountDto discountDto) {
        Discount discount = DiscountMapper.INSTANCE.discountDtoToDiscount(discountDto);
        Calendar calendar = Calendar.getInstance();
        calendar.set(2100,1,1);
        discount.setEndDate(calendar.getTime());
        discount = discountRepo.save(discount);
        discountDto.setId(discount.getId());
        discount.setChannel(channelRepo.findById(discountDto.getChannel().getChannelId()).get());
        return discountDto;
    }

    @Override
    public List<DiscountDto> findAll() {
        List<Discount> discounts = discountRepo.findAll();
        return DiscountMapper.INSTANCE.discountsToDiscountDtos(discounts);
    }

    @Override
    public ResponseEntity<?> update(List<DiscountDto> discountDtoList) {

         List<Discount> discountList =  discountRepo.findAll();
         discountList = DiscountMapper.INSTANCE.discountDtosToDiscounts(discountDtoList);
         discountRepo.saveAll(discountList);
        return (ResponseEntity<?>) DiscountMapper.INSTANCE.discountsToDiscountDtos(discountList);
    }
}