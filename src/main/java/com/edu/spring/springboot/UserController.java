package com.edu.spring.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping(value = "/user/home", method = RequestMethod.GET)
    @ResponseBody
    public String home() {
        return "user home";
    }

    @GetMapping("/user/{id}")
    @ResponseBody
    public String show(@PathVariable("id") String id) {
        return "user home id: " + id;
    }

    @PostMapping("/user/create")
    @ResponseBody
    public String create(@RequestParam("username") String username, @RequestParam(value = "password", required = false) String password) {
        return "user create, username: " + username + ", password: " + password;
    }

    @GetMapping("/user/edit")
    @ResponseBody
    public String edit(HttpServletRequest httpServletRequest){
        return "user edit: " + httpServletRequest.getRemoteHost();
    }

}
