package com.edu.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Bank {

    private ApplicationContext applicationContext;

    public Bank (ApplicationContext applicationContext){
        this.applicationContext = applicationContext;
    }

    public void show(){
        System.out.println("bank:" + applicationContext.getClass());
    }

}
