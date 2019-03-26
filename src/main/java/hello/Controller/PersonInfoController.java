package hello.Controller;

import hello.Model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

public class PersonInfoController {

    @RestController
    public class PersonController {

        @RequestMapping("/id")
        public Person person(@RequestParam(value = "ID", defaultValue = "0001") long id)  {

            return new Person(id);
        }
    }
}
