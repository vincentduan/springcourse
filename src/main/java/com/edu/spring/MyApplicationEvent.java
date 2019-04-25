package com.edu.spring;

import org.springframework.context.ApplicationEvent;

/**
 * 定义事件
 */
public class MyApplicationEvent extends ApplicationEvent {

    public MyApplicationEvent(Object source) {
        super(source);
    }
}
