package com.edu.spring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
@ConfigurationProperties("ds")
public class TomcatProperties {
    private List<String> hosts = new ArrayList<>();

    private String[] ports;

    @Override
    public String toString() {
        return "TomcatProperties{" +
                "hosts=" + hosts +
                ", ports=" + Arrays.toString(ports) +
                '}';
    }

    public String[] getPorts() {
        return ports;
    }

    public void setPorts(String[] ports) {
        this.ports = ports;
    }

    public List<String> getHosts() {
        return hosts;
    }

    public void setHosts(List<String> hosts) {
        this.hosts = hosts;
    }
}
