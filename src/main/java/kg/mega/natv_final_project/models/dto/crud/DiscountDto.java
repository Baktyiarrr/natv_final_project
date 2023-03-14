package kg.mega.natv_final_project.models.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import kg.mega.natv_final_project.models.entities.Channel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountDto {
    Long id;
    int fromDayCount;
    int discount;
    Channel channel;
}
