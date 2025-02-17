package com.murillo.first_spring_app.controller;

import com.murillo.first_spring_app.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;




    @GetMapping
    public String helloWorld(){
        return HelloWorldService.helloWorld("Pietro");
    }

    @PostMapping
    public String helloWorldPost(){
        return "Hello World Post";
    }
}
