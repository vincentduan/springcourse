package com.edu.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserConfig {

    @Value("${local.port}")
    private String localPort;

    /**
     * @Value 默认要有配置项，配置项可以为空，如果没有配置项，则可以给默认值
     */
    @Value("${tomcat.port:9090}")
    private String tomcatPort;

    @Autowired
    private Environment environment;

    public void show(){
        System.out.println("local.ip=" + environment.getProperty("local.ip"));
        System.out.println("local.port=" + localPort);
        System.out.println("name=" + environment.getProperty("name"));
        System.out.println("app.name=" + environment.getProperty("app.name"));
        System.out.println("tomcat.port=" + tomcatPort);
    }

}
