package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.Text_addDto;
import kg.mega.natv_final_project.models.entities.Text_add;

public interface Text_addService {
    Text_addDto save(Text_addDto textAddDto);
}
