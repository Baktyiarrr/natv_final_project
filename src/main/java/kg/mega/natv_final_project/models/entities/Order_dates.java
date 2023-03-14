package kg.mega.natv_final_project.models.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Date;
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "tb_order_dates")
public class Order_dates {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Date days;
    @ManyToOne
    Order order;
}
