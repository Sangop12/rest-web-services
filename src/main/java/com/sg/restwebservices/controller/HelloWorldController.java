package com.sg.restwebservices.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    static int count = 0;
    @GetMapping("hello-world")
    public static String helloWorld(){
        return "Hello World - From Git" + count++;
    }
}
