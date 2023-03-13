package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.requests.OrderDto;

public interface OrderService {

    OrderDto save(OrderDto orderDto);
}
