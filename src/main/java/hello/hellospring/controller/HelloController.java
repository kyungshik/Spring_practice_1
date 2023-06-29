package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller //Controller import
public class HelloController {
    @GetMapping("hello") //hello를 호출한다.
    public String hello(Model model){
        model.addAttribute("data", "Wesley");
        return "hello";
    }
}
