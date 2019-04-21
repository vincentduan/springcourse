package com.edu.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class, User.class, UserDao.class, UserService.class, UserController.class);
        // 从容器中获取bean---从类型获取
        System.out.println(context.getBean(MyBean.class));
        // 从容器中获取bean---从方法名字获取
        // System.out.println(context.getBean("createMyBean"));
        // 从容器中获取bean---从指定名字获取
        System.out.println(context.getBean("myBean"));

        System.out.println(context.getBean(JeepFactoryBean.class));
        System.out.println(context.getBean("&createJeepFactoryBean"));
        System.out.println(context.getBean(Jeep.class));
        System.out.println(context.getBean("createJeepFactoryBean"));

        System.out.println(context.getBean(Car.class));
        System.out.println(context.getBean(Cat.class));
        System.out.println(context.getBean(Dog.class));
        System.out.println(context.getBean(Fish.class));
        System.out.println(context.getBean("myUser"));
        System.out.println(context.getBeansOfType(User.class));
        // System.out.println(context.getBean(UserDao.class));
        System.out.println(context.getBean(UserService.class));
        System.out.println(context.getBean(UserController.class));
        User user = context.getBean("myUser", User.class);
        System.out.println("===");
        System.out.println(user);
        context.close();
    }
}
