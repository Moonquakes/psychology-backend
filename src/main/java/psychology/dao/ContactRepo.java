package psychology.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psychology.entity.Contact;

@Repository
public interface ContactRepo extends JpaRepository<Contact,String> {
}
