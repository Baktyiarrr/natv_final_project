package kg.mega.natv_final_project.mappers;

import kg.mega.natv_final_project.models.dto.ChannelDto;
import kg.mega.natv_final_project.models.entities.Channel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface ChannelMapper {
    ChannelMapper INSTANCE = Mappers.getMapper(ChannelMapper.class);
    //@Mapping(source = "channelId", target = "channelId")
    ChannelDto channelToChannelDto(Channel channel);


     Channel channelDtoToChannel(ChannelDto channelDto);
     List<ChannelDto> channelsToChannelDto(List<Channel> channels);
     @InheritInverseConfiguration
     List<Channel> channelDtosToChannel(List<ChannelDto> channelDto);

}
