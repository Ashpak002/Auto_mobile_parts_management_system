package com.automoible.automobile_system.controller;


import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Temp {

    @GetMapping("/")
    public String greet(){
        return "olla";
    }
}
