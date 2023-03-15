package kg.mega.natv_final_project.controllers;

import kg.mega.natv_final_project.models.dto.crud.PriceDto;
import kg.mega.natv_final_project.models.entities.Price;
import kg.mega.natv_final_project.services.PriceService;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{id}")
    public Price findById(@PathVariable Long id){
        return priceService.findById(id);
    }
}
