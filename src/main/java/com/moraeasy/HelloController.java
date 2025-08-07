package com.moraeasy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @GetMapping("/")
    public String hello() {
        return "Hello! Visit <a href='/home'>/home</a> for the web interface or use these API endpoints: <br>" +
               "• <a href='/api/status'>/api/status</a><br>" + 
               "• <a href='/api/info'>/api/info</a>";
    }
    
    @GetMapping("/api/status")
    public String status() {
        return "Application is running successfully!";
    }
    
    @GetMapping("/api/info")
    public String info() {
        return "Simple Spring Boot app with Thymeleaf deployed on Railway";
    }
}