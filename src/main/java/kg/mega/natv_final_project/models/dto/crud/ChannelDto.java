package kg.mega.natv_final_project.models.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class ChannelDto {
    Long channelId;
    String channelName;
    @JsonProperty("logo")
    String logoPath;
    boolean channelStatus;
}
