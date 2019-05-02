package psychology.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psychology.entity.MessageReply;

@Repository
public interface MessageReplyRepo extends JpaRepository<MessageReply,Integer> {
}
