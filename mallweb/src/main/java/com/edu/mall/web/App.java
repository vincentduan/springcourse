package com.edu.mall.web;

import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;
import web.Response;

public class App {
    static String BASE_URL = "http://127.0.0.1:8080";
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        String body = restTemplate.getForObject(BASE_URL + "/soa/product/1", String.class);
        System.out.println(body);
        Response response = new Gson().fromJson(body, Response.class);
        System.out.println(response);
        System.out.println(response.getCode());
        System.out.println(response.getMsg());
        System.out.println(response.getData());

    }
}
