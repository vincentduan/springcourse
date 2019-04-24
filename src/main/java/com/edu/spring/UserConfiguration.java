package com.edu.spring;

import com.google.gson.Gson;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class UserConfiguration {

    @Bean
    @ConditionalOnProperty(name = "runnable.enabled", havingValue = "true", matchIfMissing = true)
    public Runnable createRunnable() {
        return () -> {
        };
    }

    @Bean
    @ConditionalOnClass(name = "com.google.gson.Gson")
    public Runnable createGsonRunnable() {
        return () -> {
        };
    }

}
