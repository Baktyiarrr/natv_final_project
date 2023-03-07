package kg.mega.natv_final_project.controllers.v1;

import kg.mega.natv_final_project.models.dto.ChannelDto;
import kg.mega.natv_final_project.services.ChannelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/V1/CHANNEL/LIST")
public class ChannelController {
    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @GetMapping("/findAll")
    public List<ChannelDto> findAll(){
        return channelService.findAll();
    }
    @PostMapping("/save")
    public ChannelDto save(@RequestBody ChannelDto channelDto){
        return channelService.save(channelDto);
    }
}
