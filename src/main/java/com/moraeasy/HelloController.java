package com.moraeasy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello World from Spring Boot on Railway! 🚂";
    }
    
    @GetMapping("/api/status")
    public String status() {
        return "Application is running successfully!";
    }
    
    @GetMapping("/api/info")
    public String info() {
        return "Simple Spring Boot app deployed on Railway";
    }
}