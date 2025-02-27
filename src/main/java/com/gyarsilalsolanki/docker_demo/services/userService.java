package com.gyarsilalsolanki.docker_demo.services;

import com.gyarsilalsolanki.docker_demo.entities.User;
import com.gyarsilalsolanki.docker_demo.repositories.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {
    @Autowired
    private userRepository userRepository;

    public void saveUser(User user){
        userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
