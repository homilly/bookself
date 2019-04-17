package Common.Repository;

import Common.Entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {

    User findUserByUsername(String username);

    User findUserByPhoneNum(long phoneNum);

}
