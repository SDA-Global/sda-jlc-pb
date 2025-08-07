package com.sda.global.user_service.controller;

import com.sda.global.user_service.entity.UserDetails;
import com.sda.global.user_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/all")
    public List<UserDetails> getUser(){
        return userService.getAllUser();
    }

    @GetMapping("/user/{userId}")
    public UserDetails getUserById(@PathVariable Integer userId) {
        return userService.getUserById(userId);
    }

    @PostMapping("/user/add")
    public UserDetails addUser(@RequestBody UserDetails userDetails){
        return userService.addUser(userDetails);
    }
}
