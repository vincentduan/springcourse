package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DogConfig {

    @Bean(initMethod = "myInit", destroyMethod = "myDestory")
    public Dog createDog(){
        return new Dog();
    }


}
