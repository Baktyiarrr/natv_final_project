package kg.mega.natv_final_project.repositories;

import kg.mega.natv_final_project.models.entities.Discount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DiscountRepo extends JpaRepository<Discount, Long> {
    @Query(value = "select * from  tb_discount where channel_channel_id = :id",nativeQuery = true)
    public List<Discount> getDiscountsById(Long id);
}
