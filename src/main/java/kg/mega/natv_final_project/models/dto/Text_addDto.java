package kg.mega.natv_final_project.models.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Text_addDto {
    Long id;
    String text;
    @JsonProperty("symbol_count")
    int symbolCount;
}
