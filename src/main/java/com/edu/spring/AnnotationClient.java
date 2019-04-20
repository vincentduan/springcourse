package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationClient {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("com.edu.spring");
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createJeepFactoryBean"));

        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Fish.class));
        System.out.println(context.getBean("myUser"));
        context.close();
    }
}
