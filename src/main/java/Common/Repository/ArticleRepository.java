package Common.Repository;

import Common.Entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> {
    Article findById(long id);
}
