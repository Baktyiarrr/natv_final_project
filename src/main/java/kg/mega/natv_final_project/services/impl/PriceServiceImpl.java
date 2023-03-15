package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.PriceMapper;
import kg.mega.natv_final_project.models.dto.crud.PriceDto;
import kg.mega.natv_final_project.models.entities.Price;
import kg.mega.natv_final_project.repositories.PriceRepo;
import kg.mega.natv_final_project.services.PriceService;
import org.springframework.stereotype.Service;

@Service
public class PriceServiceImpl implements PriceService {
    private final PriceRepo priceRepo;

    public PriceServiceImpl(PriceRepo priceRepo) {
        this.priceRepo = priceRepo;
    }

    @Override
    public PriceDto save(PriceDto priceDto) {
        Price price = PriceMapper.INSTANCE.priceDtoToPrice(priceDto);
        priceRepo.save(price);
        return priceDto;
    }

    @Override
    public Price findById(Long id) {
        return priceRepo.findById(id).orElseThrow(()->{
            return new RuntimeException("Такая цена не существует!");
        });
    }
}
