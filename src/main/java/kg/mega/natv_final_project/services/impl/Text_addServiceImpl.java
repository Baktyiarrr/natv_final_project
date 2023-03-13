package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.Text_addMapper;
import kg.mega.natv_final_project.models.dto.Text_addDto;
import kg.mega.natv_final_project.models.entities.Text_add;
import kg.mega.natv_final_project.repositories.Text_addRepo;
import kg.mega.natv_final_project.services.Text_addService;
import org.springframework.stereotype.Service;

@Service
public class Text_addServiceImpl implements Text_addService {
    private final Text_addRepo textAddRepo;

    public Text_addServiceImpl(Text_addRepo textAddRepo) {
        this.textAddRepo = textAddRepo;
    }

    @Override
    public Text_addDto save(Text_addDto textAddDto) {
        Text_add textAdd = Text_addMapper.INSTANCE.text_addDtoToText_add(textAddDto);
        textAddRepo.save(textAdd);
        return textAddDto;
    }
}
