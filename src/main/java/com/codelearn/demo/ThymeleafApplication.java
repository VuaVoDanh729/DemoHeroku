package com.codelearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ThymeleafApplication {
    
    @RequestMapping("/")
    String home() {
      return "Hello World!";
    }
    
    public static void main(String[] args) {
        SpringApplication.run(ThymeleafApplication.class, args);
    }
}
