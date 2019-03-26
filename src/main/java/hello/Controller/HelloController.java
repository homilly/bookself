package hello.Controller;

import hello.Model.Hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Hello hello(@RequestParam(value ="name" , defaultValue = "hihihihiihihi" ) String hello) {

        return new Hello(hello);

    }
}
