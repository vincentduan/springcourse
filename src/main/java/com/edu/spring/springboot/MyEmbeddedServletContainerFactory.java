package com.edu.spring.springboot;

import org.apache.catalina.connector.Connector;
import org.apache.catalina.valves.AccessLogValve;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;


@Configuration
public class MyEmbeddedServletContainerFactory {
    @Bean
    public TomcatServletWebServerFactory servletContainer() {
        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
        tomcat.setPort(8081);
        tomcat.addContextValves(getLogAccessLogValve());
        tomcat.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,"/404.html"));
        tomcat.addInitializers(servletContext -> System.out.println("servlet start up =========="));
        tomcat.addConnectorCustomizers(new MyTomcatConnectorCustomizer());
        return tomcat;
    }

    private AccessLogValve getLogAccessLogValve(){
        AccessLogValve log = new AccessLogValve();
        log.setDirectory("F:/test");
        log.setEnabled(true);
        log.setPattern("common");
        log.setPrefix("springboot--");
        log.setSuffix(".txt");
        return log;
    }
    class MyTomcatConnectorCustomizer implements TomcatConnectorCustomizer {

        @Override
        public void customize(Connector connector) {
            Http11NioProtocol protocol=(Http11NioProtocol) connector.getProtocolHandler();
            //设置最大连接数
            protocol.setMaxConnections(2000);
            //设置最大线程数
            protocol.setMaxThreads(500);
        }

    }
}
