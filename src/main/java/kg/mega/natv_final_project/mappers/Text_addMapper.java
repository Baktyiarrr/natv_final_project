package kg.mega.natv_final_project.mappers;

import kg.mega.natv_final_project.models.dto.crud.TextAddDto;
import kg.mega.natv_final_project.models.entities.Text;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface Text_addMapper {
    Text_addMapper INSTANCE = Mappers.getMapper(Text_addMapper.class);
    Text text_addDtoToText_add(TextAddDto textAddDto);
    TextAddDto text_addToText_addDto(Text textAdd);
    List<Text> text_addDtosToText_add(List<TextAddDto> textAddDtos);
    @InheritInverseConfiguration
    List<TextAddDto> text_addToText_addDtos(List<Text> textAdds);
}
