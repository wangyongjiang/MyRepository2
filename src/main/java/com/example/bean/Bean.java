package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Bean {
    @Autowired
    private Environment test;

     String test1;

    public Bean (){
        System.err.println(System.getProperty("java.version"));
        System.err.println(0);
        System.err.println(System.getenv("a"));
        System.err.println(System.getProperty("config"));
        System.err.println(test);
        new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.err.println(test.getProperty("spring.profiles.active"));
            System.err.println(test.getProperty("server.port"));
            System.err.println(test1);

        }).start();
    }

    public static void main(String[] args) {
        System.err.println(System.getProperty("user.dir"));

        Arrays.stream(args).forEach(System.err::println);
    }

}
