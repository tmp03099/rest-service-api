package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @GetMapping("/abc")
    public String index(){
        return "Greetings from Spring Boot!";
    }

    @GetMapping("/open/child")
    public String newPage(){
        return ("New child page!");
    }

}