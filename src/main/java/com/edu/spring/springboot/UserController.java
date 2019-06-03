package com.edu.spring.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/home")
    public String home() {
        return "home";
    }

    @GetMapping("/user/create")
    public String create() {
        return "create";
    }

}
