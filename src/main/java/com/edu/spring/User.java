package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class User {

    private ApplicationContext applicationContext;

    public void init(){
        System.out.println("user init");
    }

    public void show(){
        System.out.println("user:" + applicationContext);
    }

    @Autowired
    public void setApplicationContext(ApplicationContext applicationContext) {
        System.out.println("applicationContext set");
        this.applicationContext = applicationContext;
    }
}
