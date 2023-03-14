package kg.mega.natv_final_project.mappers;

import kg.mega.natv_final_project.models.dto.crud.DiscountDto;
import kg.mega.natv_final_project.models.entities.Discount;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface DiscountMapper {
    DiscountMapper INSTANCE = Mappers.getMapper(DiscountMapper.class);
    DiscountDto discountToDiscountDto(Discount discount);
    Discount discountDtoToDiscount(DiscountDto discountDto);
    List<DiscountDto> discountsToDiscountDtos(List<Discount> discounts);
    @InheritInverseConfiguration
    List<Discount> discountDtosToDiscounts(List<DiscountDto > discountDtos);
}
