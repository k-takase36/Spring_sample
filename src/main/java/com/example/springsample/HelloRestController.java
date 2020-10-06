package com.example.springstudy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // ①
public class HelloRestController {
    @GetMapping("/hello") // ②
    public String hello() {
        return "Hello World!";
    }
}