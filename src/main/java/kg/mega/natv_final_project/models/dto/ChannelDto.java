package kg.mega.natv_final_project.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ChannelDto {
    /*Long channelId;*/
    @JsonProperty("channel_name")
    String channelName;
    @JsonProperty("logo")
    String logoPath;
    @JsonProperty("channel_status")
    boolean channelStatus;
    @JsonProperty("price_per_letter")
    double pricePerLetter;
    List<DiscountDto> discounts;
/*    @JsonProperty("price_per_letter")
    PriceDto priceDto;*/

}
