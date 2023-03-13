package kg.mega.natv_final_project.controllers.v1;

import kg.mega.natv_final_project.models.dto.requests.OrderDto;
import kg.mega.natv_final_project.services.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("/save")
    public OrderDto save(@RequestBody OrderDto orderDto){
        return orderService.save(orderDto);
    }
}
