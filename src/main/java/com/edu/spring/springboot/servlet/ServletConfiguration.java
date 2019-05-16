package com.edu.spring.springboot.servlet;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootConfiguration
public class ServletConfiguration {

    @Bean
    public ServletRegistrationBean createBookServlet() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new BookServlet(), "/book.do");
        return servletRegistrationBean;
    }

    @Bean
    public FilterRegistrationBean createFilterRegistraionBean() {
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
        filterRegistrationBean.setFilter(new EchoFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/book.do"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean<StartUpListener> createServletListenerRegistrationBean() {
        ServletListenerRegistrationBean<StartUpListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean(new StartUpListener() );
        return servletListenerRegistrationBean;
    }


}
