package com.edu.spring.bean;

import com.google.gson.Gson;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class RunnableConfiguration {

    @Bean
    public Runnable createRunnable(){
        return ()->{};
    }

    @Bean
    public Gson createGson(){
        return new Gson();
    }

}
