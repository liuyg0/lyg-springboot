package com.app;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @CrossOrigin
    @GetMapping("/hello")
    public String hello(){
        return "9999";
    }
}
