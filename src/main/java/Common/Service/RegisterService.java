package Common.Service;

import Common.Controller.UserInfoController;
import Common.Entity.User;
import Common.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RegisterService {
    @Resource
    private UserRepository userRepository;

    @Autowired
    UserInfoController userInfoController;

   public long userRegister(User user){

       return userRepository.save(user).getId();

   }


}
