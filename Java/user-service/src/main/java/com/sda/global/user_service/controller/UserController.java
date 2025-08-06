package com.sda.global.user_service.controller;

import com.sda.global.user_service.Entity.UserDetails;
import com.sda.global.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/all")
    public List<UserDetails> getUser(){
        return userService.getAllUser();
    }

    @PostMapping("/user/add")
    public UserDetails addUser(@RequestBody UserDetails userDetails){
        return userService.addUser(userDetails);
    }
}
