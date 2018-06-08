package personalstock.restapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import personalstock.restapi.entity.Video;

import java.util.Collection;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

    Collection<Video> findByCreatorId(Long id);

    Collection<Video> findByOrderId(Long id);

}
