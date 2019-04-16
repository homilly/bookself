package Common.Controller;

import Common.Entity.User;
import Common.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Controller
public class HelloController {

    @Autowired
    UserRepository userRepository;
//
//    private User user = new User();

    @RequestMapping("/welcome")
    public String hello(@RequestParam(value ="name" , defaultValue = "hihihihiihihi" ) String hello) {

        return "welcomePage";

    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpSession session) {

        String str = request.getParameter("username");
        String password = request.getParameter("password");



        Optional<User> user = userRepository.findById(1);

        System.out.println(user);

//      user = userRepository.findUserByUsername();

        return "login";

    }

    @RequestMapping("/register")
    public String register() {

        return "register";
    }
}
