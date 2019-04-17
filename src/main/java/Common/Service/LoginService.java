package Common.Service;

import Common.Entity.User;
import Common.Repository.UserRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class LoginService {

    @Resource
    UserRepository userRepository;

    public long userLoginByUsername(String username,String password) {
        User user = userRepository.findUserByUsername(username);



        if(null == user)
            return -1;

        if(user.getPassword().equals(password))
            return user.getId();

        return -2;
    }

    public long userLoginByPhoneNum(long phoneNumber,String password) {
        User user = userRepository.findUserByPhoneNum(phoneNumber);

        if(null == user)
            return -1;

        if(user.getPassword().equals(password))
            return user.getId();

        return -2;
    }


}
