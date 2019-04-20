package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.inject.Inject;

@Component("myUser")
public class User {

    // Spring提供的注解
    @Autowired
    private UserService userService;

    // 使用JSR-250的注解
    @Resource
    private Car car;

    // 使用JSR-330的注解
    @Inject
    private Cat cat;

    @Override
    public String toString() {
        return "User{" +
                "userService=" + userService +
                ", car=" + car +
                ", cat=" + cat +
                '}';
    }
}
