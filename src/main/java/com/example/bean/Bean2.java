package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Configuration
public class Bean2 {
    @Value("123")
    private Environment test;

    @Bean("aaaaa")
    public String a() {
        System.err.println(111);
        return "1";
    }

}
