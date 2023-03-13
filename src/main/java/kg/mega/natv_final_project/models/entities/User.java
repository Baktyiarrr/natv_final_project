package kg.mega.natv_final_project.models.entities;

import jakarta.persistence.*;
import kg.mega.natv_final_project.models.enums.Status;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;
import org.hibernate.boot.archive.scan.internal.ScanResultImpl;

import javax.management.relation.Role;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String fio;
    Role role;
    String login;
    String email;
    String phone;
    Status userStatus;
}
