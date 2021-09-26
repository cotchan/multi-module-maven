package com.example.myapp;

import com.example.mylibrary.service.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.example.mylibrary")
@RestController
public class MyAppApplication {

    private final MyService myService;

    public MyAppApplication(MyService myService) {
        this.myService = myService;
    }

    @GetMapping
    public String home() {
        return myService.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

}
