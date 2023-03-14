package kg.mega.natv_final_project.models.dto.crud;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import kg.mega.natv_final_project.models.entities.Channel;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto {
    Long id;
    double pricePerSymbol;
    double bannerPrice;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date startDate;
    @JsonFormat(pattern = "dd.MM.yyyy")
    Date endDate;
    Channel channel;
}
