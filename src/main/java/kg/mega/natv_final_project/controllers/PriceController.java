package kg.mega.natv_final_project.controllers;

import kg.mega.natv_final_project.models.dto.crud.PriceDto;
import kg.mega.natv_final_project.services.PriceService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/price")
public class PriceController {
    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }
    @PostMapping("/save")
    public PriceDto save(@RequestBody PriceDto priceDto){
        return priceService.save(priceDto);
    }
}
