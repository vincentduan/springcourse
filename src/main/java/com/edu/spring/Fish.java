package com.edu.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Fish {

    @PostConstruct
    public void initial(){
        System.out.println("fish init");
    }

    @PreDestroy
    public void close(){
        System.out.println("fish close");
    }

}
