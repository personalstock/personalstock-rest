package personalstock.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personalstock.restapi.entity.VideoOrder;

import java.util.Collection;

@Repository
public interface VideoOrderRepository extends JpaRepository<VideoOrder, Long> {

    Collection<VideoOrder> findByPosterId(Long id);

}
