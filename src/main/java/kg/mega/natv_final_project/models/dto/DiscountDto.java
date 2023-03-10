package kg.mega.natv_final_project.models.dto;

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
    @JsonProperty("from_day_count")
    int fromDayCount;
    int discount;
    Channel channel;
}
