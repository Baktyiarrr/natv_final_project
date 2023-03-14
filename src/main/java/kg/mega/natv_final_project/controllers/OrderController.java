package kg.mega.natv_final_project.controllers;

import kg.mega.natv_final_project.models.dto.crud.OrderDto;
import kg.mega.natv_final_project.models.entities.Order;
import kg.mega.natv_final_project.repositories.OrderRepo;
import kg.mega.natv_final_project.services.OrderService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;
    private final OrderRepo orderRepo;

    public OrderController(OrderService orderService, OrderRepo orderRepo) {
        this.orderService = orderService;
        this.orderRepo = orderRepo;
    }
    @PostMapping("/save")
    public OrderDto save(@RequestBody OrderDto orderDto){
        return orderService.save(orderDto);
    }
    @GetMapping("/{id}")
    public Order findById(@PathVariable Long id){
        return orderService.findById(id);
    }
}
