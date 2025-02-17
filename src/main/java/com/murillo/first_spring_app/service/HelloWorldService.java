package com.murillo.first_spring_app.service;

import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {
    public static String helloWorld(String name){
        return "Hello World " + name;
    }
}
