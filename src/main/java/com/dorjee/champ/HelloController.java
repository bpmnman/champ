package com.dorjee.champ;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/")
    public String index() {
        int count = 3;
        String name = "dorjee";
        String home = "going home";
        String message = "super shure";
        return "Greetings rom Spring Boot!";
    }
}
