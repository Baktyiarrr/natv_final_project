package kg.mega.natv_final_project.mappers;

import jakarta.persistence.Column;
import kg.mega.natv_final_project.models.dto.crud.ChannelDto;
import kg.mega.natv_final_project.models.entities.Channel;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
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
