package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.crud.OrderDto;
import kg.mega.natv_final_project.models.entities.Order;

public interface OrderService {

    OrderDto save(OrderDto orderDto);

    Order findById(Long id);
}
