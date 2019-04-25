package com.edu.spring;

import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandle {

    /**
     * 参数一定要是ApplicationEvent,或者其子类
     * @param event
     */
    @EventListener
    public void event(MyApplicationEvent event){
        System.out.println("接受到事件" + event.getClass());
    }

    @EventListener
    public void event2(ContextStoppedEvent event){
        System.out.println("应用停止事件：" + event);
    }

}
