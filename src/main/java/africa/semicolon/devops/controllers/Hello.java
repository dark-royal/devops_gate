package africa.semicolon.devops.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @PostMapping("/hello")
    public String sayHelloWorld() {
        return "Hello World";

    }
}
