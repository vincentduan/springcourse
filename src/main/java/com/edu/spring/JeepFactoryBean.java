package com.edu.spring;

import org.springframework.beans.factory.FactoryBean;

public class JeepFactoryBean implements FactoryBean<Jeep> {

    /**
     * 创建的实例对象
     * @return
     * @throws Exception
     */
    @Override
    public Jeep getObject() throws Exception {
        return new Jeep();
    }

    /**
     *
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Jeep.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
