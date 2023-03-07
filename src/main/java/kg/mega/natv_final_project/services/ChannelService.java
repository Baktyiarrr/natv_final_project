package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.ChannelDto;
import kg.mega.natv_final_project.models.entities.Channel;

import java.util.List;

public interface ChannelService {
    List<ChannelDto> findAll();

    ChannelDto save(ChannelDto channelDto);
}
