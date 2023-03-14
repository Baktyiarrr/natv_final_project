package kg.mega.natv_final_project.controllers;

import kg.mega.natv_final_project.models.dto.crud.TextAddDto;
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
    public TextAddDto save(TextAddDto textAddDto){
        return textAddService.save(textAddDto);
    }
}
