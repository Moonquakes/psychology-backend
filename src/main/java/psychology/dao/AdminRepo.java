package psychology.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psychology.entity.Administer;

@Repository
public interface AdminRepo extends JpaRepository<Administer, String> {
}
