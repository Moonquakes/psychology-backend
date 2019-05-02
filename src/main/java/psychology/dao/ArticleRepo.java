package psychology.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import psychology.entity.Article;

@Repository
public interface ArticleRepo extends JpaRepository<Article,String> {
}
