package com.sda.global.user_service.service;

import com.sda.global.user_service.Entity.UserDetails;
import com.sda.global.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<UserDetails> getAllUser(){
        return userRepository.findAll();
    }

    public UserDetails addUser(UserDetails userDetails){
        return userRepository.save(userDetails);
    }
}
