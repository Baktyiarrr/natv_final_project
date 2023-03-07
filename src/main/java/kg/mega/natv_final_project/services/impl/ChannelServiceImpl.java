package kg.mega.natv_final_project.services.impl;

import kg.mega.natv_final_project.mappers.ChannelMapper;
import kg.mega.natv_final_project.models.dto.ChannelDto;
import kg.mega.natv_final_project.models.entities.Channel;
import kg.mega.natv_final_project.repositories.ChannelRepo;
import kg.mega.natv_final_project.services.ChannelService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChannelServiceImpl implements ChannelService {
    private final ChannelRepo channelRepo;



    public ChannelServiceImpl(ChannelRepo channelRepo) {
        this.channelRepo = channelRepo;

    }

    @Override
    public List<ChannelDto> findAll() {
        List<Channel> channels = channelRepo.findAllByChannelStatus();
        return ChannelMapper.INSTANCE.channelsToChannelDto(channels);
    }

    @Override
    public ChannelDto save(ChannelDto channelDto) {
        Channel channel = ChannelMapper.INSTANCE.channelDtoToChannel(channelDto);
        channel = channelRepo.save(channel);
        /*channelDto.setChannelId(channel.getChannelId());*/
        return channelDto;
    }
}
