package com.sda.global.user_service.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Value("${stu.name}")
    private String name;

    @Value("${stu.names}")
    List<String> names;

    @GetMapping("/user/show")
    public String showData(){
        return "student : "+ names;
    }
}
