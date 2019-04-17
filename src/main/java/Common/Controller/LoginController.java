package Common.Controller;

import Common.Service.LoginService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@Api(value = "登录")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/login")
    @ApiOperation(value = "用户登录",notes = "用户登录")
    public String login(HttpServletRequest request, HttpSession session) {

        long id = -1;

        String str = request.getParameter("username");
        String password = request.getParameter("password");

        id = loginService.userLoginByUsername(str,password);

        System.out.println(id);

        if(id < 0)
            return "login";
        if(id > 0 )
            return "indexPage";

        return "indexPage";

    }
}
