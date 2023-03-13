package kg.mega.natv_final_project.models.dto.requests;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import kg.mega.natv_final_project.models.entities.Channel;
import kg.mega.natv_final_project.models.entities.Text_add;
import kg.mega.natv_final_project.models.enums.Status;
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
    @JsonProperty("client_email")
    String clientEmail;
    @JsonProperty("client_fio")
    String clientFIO;
    @JsonProperty("client_phone")
    String clientPhone;
    Text_add text;
    @JsonProperty("total_price")
    double totalPrice;
    Status status;
    List<Channel> channels;
}
