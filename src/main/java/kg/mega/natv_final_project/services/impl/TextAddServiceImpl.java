package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.Text_addMapper;
import kg.mega.natv_final_project.models.dto.crud.TextAddDto;
import kg.mega.natv_final_project.models.entities.Text;
import kg.mega.natv_final_project.repositories.TextAddRepo;
import kg.mega.natv_final_project.services.Text_addService;
import org.springframework.stereotype.Service;

@Service
public class TextAddServiceImpl implements Text_addService {
    private final TextAddRepo textAddRepo;

    public TextAddServiceImpl(TextAddRepo textAddRepo) {
        this.textAddRepo = textAddRepo;
    }

    @Override
    public TextAddDto save(TextAddDto textAddDto) {
        Text textAdd = Text_addMapper.INSTANCE.text_addDtoToText_add(textAddDto);
        textAddRepo.save(textAdd);
        return textAddDto;
    }
}
