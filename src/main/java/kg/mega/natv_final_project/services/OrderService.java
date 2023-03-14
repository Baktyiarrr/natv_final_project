package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.crud.OrderDto;
import kg.mega.natv_final_project.models.dto.requests.request3.OrderReqDto;
import kg.mega.natv_final_project.models.dto.responses.response3.OrderResDto;
import kg.mega.natv_final_project.models.entities.Order;

public interface OrderService {

    OrderDto crudSave(OrderDto orderDto);

    Order findById(Long id);

    OrderResDto save(OrderReqDto orderReqDto);
}
