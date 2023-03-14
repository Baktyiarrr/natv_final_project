package kg.mega.natv_final_project.mappers;

import kg.mega.natv_final_project.models.dto.crud.PriceDto;
import kg.mega.natv_final_project.models.entities.Price;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface PriceMapper {
    PriceMapper INSTANCE = Mappers.getMapper(PriceMapper.class);
    Price priceDtoToPrice(PriceDto priceDto);
    PriceDto priceToPriceDto(Price price);
}
