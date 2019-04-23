package com.edu.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


public class App {


    public static void main(String[] args) {
<<<<<<< HEAD
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.edu.spring");
        context.getBeansOfType(Person.class).values().forEach(person -> System.out.println(person));
        context.close();
=======
        ConfigurableApplicationContext context = SpringApplication.run(App2.class, args);
        context.getBean(Runnable.class).run();
>>>>>>> 489acedf9b0448df23a620fe4255bddbd3a4faf0
    }
}
