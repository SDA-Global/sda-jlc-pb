package com.sda.global.user_service.service;

import com.sda.global.user_service.entity.UserDetails;
import com.sda.global.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PasswordEncoder passwordEncoder;

    public List<UserDetails> getAllUser(){
        return userRepository.findAll();
    }

    public UserDetails addUser(UserDetails userDetails){
        userDetails.setPasscode(passwordEncoder.encode(userDetails.getPasscode()));
        return userRepository.save(userDetails);
    }

    public UserDetails getUserById(Integer userId) {
        return userRepository.getUserByUserId(userId);
    }
}
