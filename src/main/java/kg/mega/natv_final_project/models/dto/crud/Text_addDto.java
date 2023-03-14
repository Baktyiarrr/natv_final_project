package kg.mega.natv_final_project.models.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Text_addDto {
    Long id;
    String text;
    int symbolCount;
}
