package Common.Repository;

import Common.Entity.User;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

//    User findUserByUsername();

}
