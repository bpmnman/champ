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
        return "Greetings rom Spring Boot!";
    }
}
