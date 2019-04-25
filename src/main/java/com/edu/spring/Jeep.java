package com.edu.spring;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class Jeep implements Runnable {

    @Async
    @Override
    public void run() {
        try {
            for(int i = 1; i<= 10; i++){
                System.out.println("============" + i);
                TimeUnit.SECONDS.sleep(1);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
