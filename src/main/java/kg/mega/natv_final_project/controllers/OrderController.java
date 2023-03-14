package kg.mega.natv_final_project.controllers;

import kg.mega.natv_final_project.models.dto.crud.OrderDto;
import kg.mega.natv_final_project.models.dto.requests.request3.OrderReqDto;
import kg.mega.natv_final_project.models.dto.responses.response3.OrderResDto;
import kg.mega.natv_final_project.models.entities.Order;
import kg.mega.natv_final_project.repositories.OrderRepo;
import kg.mega.natv_final_project.services.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/crud/save")
    public OrderDto crudSave(@RequestBody OrderDto orderDto){
        return orderService.crudSave(orderDto);
    }
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
        return orderService.findById(id);
    }
    @PostMapping("/saveOrder")
    public OrderResDto save(@RequestBody OrderReqDto orderReqDto){
        return orderService.save(orderReqDto);
    }

}
