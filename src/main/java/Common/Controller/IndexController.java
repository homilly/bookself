package Common.Controller;

import Common.Entity.Writer;
import Common.Repository.UserRepository;
import Common.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class IndexController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserInfoController userInfoController;

    @Autowired
    IndexService indexService;

    @RequestMapping("/")
    public String hello(Model model) {

        List<Writer> writerList = indexService.getAllWriters();
        model.addAttribute("writerList",writerList);
        indexService.getAllWriters();

        return "indexPage";

    }
}
