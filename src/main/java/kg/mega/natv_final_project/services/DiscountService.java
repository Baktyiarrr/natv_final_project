package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.DiscountDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface DiscountService {
    DiscountDto save(DiscountDto discountDto);

    List<DiscountDto> findAll();

    ResponseEntity<?> update(List<DiscountDto> discountDtoList);
}
