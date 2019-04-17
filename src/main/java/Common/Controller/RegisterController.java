package Common.Controller;

import Common.Entity.User;
import Common.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @RequestMapping("/linkedRegister")
    public String register() {
        return "register";
    }

    @RequestMapping("/register")
    public String UserRegister(HttpServletRequest request) {

        long id = -1;

        String username = request.getParameter("username");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String phoneNum = request.getParameter("phoneNumber");
        String signature = request.getParameter("signature");
        String password = request.getParameter("password");

        long phoneNumber = Integer.valueOf(phoneNum);

        User user = new User();

        user.setUsername(username);

        user.setName(name);

        user.setGender(gender);

        user.setPhoneNum(phoneNumber);

        user.setSignature(signature);

        user.setPassword(password);

        id = registerService.userRegister(user);

        if ( id >0 )
            return "login";
        if ( id<0 )
            return "register";

        return "register";
    }
}
