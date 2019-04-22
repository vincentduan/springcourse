package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


public class App {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
        context.getBean(Runnable.class).run();
    }
}
