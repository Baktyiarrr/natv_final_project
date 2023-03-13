package kg.mega.natv_final_project.models.entities;

import jakarta.persistence.*;
import jdk.jfr.Timestamp;
import lombok.AccessLevel;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "tb_discount")
public class Discount {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    int discount;
    @CreationTimestamp
    Date startDate;

    Date endDate;
    int fromDayCount;
    @ManyToOne
    Channel channel;
}
