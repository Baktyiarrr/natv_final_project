package kg.mega.natv_final_project.controllers;

import kg.mega.natv_final_project.models.dto.crud.ChannelDto;
import kg.mega.natv_final_project.models.dto.responses.response1.ChannelListDto;
import kg.mega.natv_final_project.models.entities.Channel;
import kg.mega.natv_final_project.services.ChannelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/channel")
public class ChannelController {
    private final ChannelService channelService;

    public ChannelController(ChannelService channelService) {
        this.channelService = channelService;
    }
    @GetMapping("/list")
    List<ChannelListDto> findAll() {
        return channelService.findAll();
    }
    @PostMapping("/save")
    public ChannelDto save(@RequestBody ChannelDto channelDto){
        return channelService.save(channelDto);
    }
    @GetMapping("/{channelId}")
    public Channel findById(@PathVariable Long channelId){
        return channelService.findById(channelId);
    }
    @PutMapping("/update")
    public ChannelDto update(@RequestBody ChannelDto channelDto){
        return channelService.update(channelDto);
    }
}
