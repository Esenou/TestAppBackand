package com.example.demo.controller.statics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    @GetMapping
    public String main(){
        return "Welcome to Test Application";
    }

}
