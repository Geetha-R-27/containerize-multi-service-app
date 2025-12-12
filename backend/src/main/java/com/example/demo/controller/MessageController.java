package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class MessageController {

    @GetMapping("/api/messages")
    public Map<String,String> msg() {
        return Map.of("message", "Hello from Spring Boot backend!");
    }
}

