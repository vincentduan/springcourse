package com.edu.spring.springboot;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAspect {

    @Before("execution(* com.edu.spring.springboot.dao..*.*(..))")
    public void log() {
        System.out.println("method log done" );
    }

}
