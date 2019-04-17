package Common.Repository;

import Common.Entity.Writer;
import org.springframework.data.repository.CrudRepository;

public interface WriterRepository extends CrudRepository<Writer,Long> {

    Writer findById(long id);

}
