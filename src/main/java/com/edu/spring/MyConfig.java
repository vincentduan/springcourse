package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 配置类
 */

@Configuration
public class MyConfig {

    // 配置一个bean
    @Bean(name = "myBean")
    @Scope("prototype")
    public MyBean createMyBean(){
        return new MyBean();
    }

    @Bean
    public JeepFactoryBean createJeepFactoryBean(){
        return new JeepFactoryBean();
    }

    @Bean
    public Car createJeep(CarFactory carFactory){
        return carFactory.create();
    }

    @Bean
    public CarFactory createCarFactory(){
        return new CarFactory();
    }

    @Bean
    public Cat createCat(){
        return new Cat();
    }

    @Bean(initMethod = "myInit", destroyMethod = "myDestory")
    public Dog createDog(){
        return new Dog();
    }

    @Bean
    public Fish createFish(){
        return new Fish();
    }

}
