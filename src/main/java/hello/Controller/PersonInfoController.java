package hello.Controller;

import hello.Entity.Person;
import hello.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class PersonInfoController {

    @Autowired PersonRepository personRepository;
        @RequestMapping("/all")
        public @ResponseBody Iterable<Person> getAllPerson()  {

            return personRepository.findAll();
        }

        @RequestMapping("add")
        public String createUserInfo(@RequestParam(value = "name" , defaultValue = "xiao ming") String name) {

            String sex = "male";

            Person person = new Person();

            person.setName(name);

            person.setSex(sex);

            person.setSignature("I must be consider future");

            personRepository.save(person);

            return "saved";

        }

}
