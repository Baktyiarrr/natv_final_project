package kg.mega.natv_final_project.models.dto.crud;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TextAddDto {
    Long id;
    String text;
    int symbolCount;
}
