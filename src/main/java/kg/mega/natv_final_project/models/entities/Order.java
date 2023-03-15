package kg.mega.natv_final_project.models.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import kg.mega.natv_final_project.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "tb_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date createdDate = new Date();
    String clientEmail;
    String clientFIO;
    String clientPhone;
    Status orderStatus;
    @ManyToOne
    Channel channel;
    @ManyToOne
    Text textAdd;
    @ManyToOne
    BannerAdd bannerAdd;
    double orderSum;

}
