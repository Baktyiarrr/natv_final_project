package kg.mega.natv_final_project.mappers;

import kg.mega.natv_final_project.models.dto.Text_addDto;
import kg.mega.natv_final_project.models.entities.Text_add;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface Text_addMapper {
    Text_addMapper INSTANCE = Mappers.getMapper(Text_addMapper.class);
    Text_add text_addDtoToText_add(Text_addDto textAddDto);
    Text_addDto text_addToText_addDto(Text_add textAdd);
    List<Text_add> text_addDtosToText_add(List<Text_addDto> textAddDtos);
    @InheritInverseConfiguration
    List<Text_addDto> text_addToText_addDtos(List<Text_add> textAdds);
}
