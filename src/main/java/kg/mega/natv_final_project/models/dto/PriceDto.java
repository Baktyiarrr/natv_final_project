package kg.mega.natv_final_project.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PriceDto {
    Long priceId;
    @JsonProperty("price_per_letter")
    double pricePerLetter;
    @JsonProperty("banner_price")
    double bannerPrice;
}
