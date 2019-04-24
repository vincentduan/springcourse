package com.edu.spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootConfiguration
public class MyConfig {

    @Bean
    public Runnable createRunable(){
        System.out.println("===1==");
        return () -> {};
    }

    /**
     * 当application-test.properties激活之后才装配这个Bean
     * @return
     */
    @Bean
    @Profile("test")
    public Runnable createRunable2(){
        System.out.println("===2==");
        return () -> {};
    }

    /**
     * 当application-dev.properties激活之后才装配这个Bean
     * @return
     */
    @Bean
    @Profile("dev")
    public Runnable createRunable3(){
        System.out.println("===3==");
        return () -> {};
    }


}
