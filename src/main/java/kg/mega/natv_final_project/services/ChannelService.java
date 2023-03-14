package kg.mega.natv_final_project.services;

import kg.mega.natv_final_project.models.dto.crud.ChannelDto;
import kg.mega.natv_final_project.models.dto.responses.response1.ChannelListDto;
import kg.mega.natv_final_project.models.entities.Channel;

import java.util.List;

public interface ChannelService {
    List<ChannelListDto> findAll();

    ChannelDto save(ChannelDto channelDto);

    Channel findById(Long channelId);

    ChannelDto update(ChannelDto channelDto);
}
