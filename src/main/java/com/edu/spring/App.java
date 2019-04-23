package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;


public class App {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(App2.class);
        ConfigurableApplicationContext context = application.run(args);
        context.getBean(Runnable.class).run();
        System.out.println(context.getBean(List.class));
    }

}
