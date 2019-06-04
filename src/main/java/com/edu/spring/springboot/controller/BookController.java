package com.edu.spring.springboot.controller;

import com.edu.spring.springboot.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    private UserDao userDao;

    @GetMapping("/book/home")
    public String home() {
        System.out.println("/book/home url is invoke");
        return "book home";
    }

    @GetMapping("/book/show")
    public String show(@RequestParam("id") String id) {
        System.out.println("/book/show url is invoke");
        userDao.addUser("aaa");
        return "book" + id;
    }

}
