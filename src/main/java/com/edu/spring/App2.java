package com.edu.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class App2 {

    @Bean
    public Runnable createRunable(){
        return () -> {
            System.out.println("spring boot is running");
        };
    }

}
