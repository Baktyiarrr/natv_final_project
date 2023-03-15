package kg.mega.natv_final_project.repositories;

import kg.mega.natv_final_project.models.entities.OrderDates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDatesRepo extends JpaRepository<OrderDates, Long> {
}
