package kg.mega.natv_final_project.models.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import kg.mega.natv_final_project.models.entities.Channel;
import kg.mega.natv_final_project.models.entities.Text_add;
import kg.mega.natv_final_project.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDto {

    String clientEmail;
    String clientFIO;
    String clientPhone;
    Text_add text;
    double totalPrice;
    Status status;
    List<Channel> channels;
}
