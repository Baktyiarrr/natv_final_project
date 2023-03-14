package kg.mega.natv_final_project.models.dto.responses.response3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelsListResDto {
    Long channelId;
    List<Date>days;
    double price;
    double priceWithDiscount;
}
