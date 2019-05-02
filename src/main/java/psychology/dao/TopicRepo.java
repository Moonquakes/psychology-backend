package psychology.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psychology.entity.Topic;

import java.util.List;

@Repository
public interface TopicRepo extends JpaRepository<Topic,Integer> {
    List<Topic> findByUserEmail(String userEmail);
}
