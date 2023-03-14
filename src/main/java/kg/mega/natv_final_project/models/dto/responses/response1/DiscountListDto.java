package kg.mega.natv_final_project.models.dto.responses.response1;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DiscountListDto {
    int fromDayCount;
    double discount;
}
