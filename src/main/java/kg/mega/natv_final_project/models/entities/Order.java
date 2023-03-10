package kg.mega.natv_final_project.models.entities;

import jakarta.persistence.*;
import kg.mega.natv_final_project.models.enums.Status;
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
    Date createdDate;
    String clientEmail;
    String clientFio;
    String clientPhone;
    Status orderStatus;
    @ManyToOne
    Channel channel;
    @ManyToOne
    Text_add textAdd;
    @ManyToOne
    Banner_add bannerAdd;
    double orderSum;

}
