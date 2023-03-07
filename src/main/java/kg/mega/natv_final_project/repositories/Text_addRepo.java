package kg.mega.natv_final_project.repositories;

import kg.mega.natv_final_project.models.entities.Text_add;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Text_addRepo extends JpaRepository<Text_add, Long> {
}
