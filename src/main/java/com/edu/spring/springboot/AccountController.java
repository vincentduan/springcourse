package com.edu.spring.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/reg")
    public String reg(){
        return "reg";
    }

    @GetMapping("/logout")
    public String logout(Model model){
        model.addAttribute("username", "admin");
        model.addAttribute("logout", "true");
        return "logout";
    }

}
