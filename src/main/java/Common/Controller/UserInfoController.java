package Common.Controller;

import Common.Entity.User;
import Common.Entity.Reader;
import Common.Entity.Writer;
import Common.Repository.UserRepository;
import Common.Repository.ReaderRepository;
import Common.Repository.WriterRepository;
import Common.Service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;


@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    WriterRepository writerRepository;

    @Autowired
    ReaderRepository readerRepository;

    @Autowired
    IndexService indexService;

    @RequestMapping("/allUsers")
    public String getAllUsers(Model model) {

        Iterable<User> person = userRepository.findAll();

        List<User> personList = new ArrayList<>();

        person.forEach(user -> {personList.add(user);} );


        model.addAttribute("personList",personList);

        return "userInfoPage";

    }

    @RequestMapping("/allWriters")
    public @ResponseBody String getAllWriter(Model model) {
        List<Writer> writerList = indexService.getAllWriters();
        model.addAttribute("writerList",writerList);
        return "writersGroundPage";
    }

    @RequestMapping("/allReaders")
    public @ResponseBody Iterable<Reader> getAllReader() {
        return readerRepository.findAll();
    }

    @RequestMapping("/addUser")
    public void createUserInfo(User user) {

        userRepository.save(user);

        return;

    }

    @RequestMapping("/addWriter")
    public String createWriterInfo(@RequestParam(value = "name") String name) {


        Writer writer = new Writer();

        writer.setName(name);

        writerRepository.save(writer);

        return "Writer information saved. ";
    }

    @RequestMapping("/addReader")
    public String createReaderInfo(@RequestParam(value = "name") String name, String gender) {
        Reader reader = new Reader();
        reader.setName(name);
        reader.setGender(gender);

        readerRepository.save(reader);

        return "Reader information saved.";
    }

}
