package kg.mega.natv_final_project.controllers.v1;

import kg.mega.natv_final_project.models.dto.Text_addDto;
import kg.mega.natv_final_project.models.entities.Text_add;
import kg.mega.natv_final_project.services.Text_addService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("text_add")
public class Text_addController {
    private final Text_addService textAddService;

    public Text_addController(Text_addService textAddService) {
        this.textAddService = textAddService;
    }
    @PostMapping("/save")
    public Text_addDto save(Text_addDto textAddDto){
        return textAddService.save(textAddDto);
    }
}
