package Common.Controller;

import Common.Entity.User;
import Common.Entity.Reader;
import Common.Entity.Writer;
import Common.Repository.UserRepository;
import Common.Repository.ReaderRepository;
import Common.Repository.WriterRepository;
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
public class PersonInfoController {

    @Autowired
    UserRepository userRepository;

    @Autowired
    WriterRepository writerRepository;

    @Autowired
    ReaderRepository readerRepository;


    @RequestMapping("/all")
    public String getAllPerson(Model model) {

        Iterable<User> person = userRepository.findAll();

        List<User> personList = new ArrayList<>();

        person.forEach(user -> {personList.add(user);} );


        model.addAttribute("personList",personList);

//        model.addAttribute("id","000001");
//        model.addAttribute("name","xiao hua");

        return "UserInfoPage";

//        return personRepository.findAll();


    }

    @RequestMapping("/writer")
    public @ResponseBody
    Iterable<Writer> getAllWriter() {
        return writerRepository.findAll();
    }

    @RequestMapping("/reader")
    public @ResponseBody
    Iterable<Reader> getAllReader() {
        return readerRepository.findAll();
    }

    @RequestMapping("add")
    public String createUserInfo(@RequestParam(value = "name", defaultValue = "xiao ming") String name) {

        String sex = "male";

        User person = new User();

        person.setName(name);

        person.setSex(sex);

        person.setSignature("I must be consider future");

        userRepository.save(person);

        return "saved";

    }

    @RequestMapping("addWriter")
    public String createWriterInfo(@RequestParam(value = "name") String name) {


        Writer writer = new Writer();

        writer.setName(name);

        writerRepository.save(writer);

        return "Writer information saved. ";
    }

    @RequestMapping("addReader")
    public String createReaderInfo(@RequestParam(value = "name") String name, String gender) {
        Reader reader = new Reader();
        reader.setName(name);
        reader.setGender(gender);

        readerRepository.save(reader);

        return "Reader information saved.";
    }

}
