package com.edu.spring;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootConfiguration
public class MyConfig {

    @Bean
    public List<String> createList(){
        ArrayList arrayList = new ArrayList();
        arrayList.add("a");
        return arrayList;
    }

}
