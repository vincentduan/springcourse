package com.edu.mall.web;

import java.util.List;

public class LoadBalance {
    private List<String> services;
    private int index = 0;

    public LoadBalance(List<String> services) {
        this.services = services;
    }

    public String choose() {
        String service = services.get(index);
        index++;
        if (index >= services.size()) {
            index = 0;
        }
        return service;
    }
}
