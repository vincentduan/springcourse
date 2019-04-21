package com.edu.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

/**
 * BeanPostProcessor会在每个bean初始化的时候，调用一次
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {



    // 在bean依赖装配（属性设置完）完成之后触发
    @Nullable
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("====postProcessBeforeInitialization======" + bean.getClass());
        if(bean instanceof User){
            return new LogUser();
        }
        return bean;
    }

    // 在bean init方法执行之后触发
    @Nullable
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("====postProcessAfterInitialization======" + bean.getClass());
        return bean;
    }
}
