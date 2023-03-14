package kg.mega.natv_final_project.models.dto.requests.request3;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ChannelsListReqDto {
    Long channelId;
    List<?>days;
}
