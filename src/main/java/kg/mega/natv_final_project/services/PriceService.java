package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.crud.PriceDto;
import kg.mega.natv_final_project.models.entities.Price;

public interface PriceService {
    PriceDto save(PriceDto priceDto);

    Price findById(Long id);
}
