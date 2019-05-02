package psychology.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psychology.entity.TopicReply;

@Repository
public interface TopicReplyRepo extends JpaRepository<TopicReply,Integer> {
}
