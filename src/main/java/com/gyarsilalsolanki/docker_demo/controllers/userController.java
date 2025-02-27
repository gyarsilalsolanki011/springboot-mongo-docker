package com.gyarsilalsolanki.docker_demo.controllers;

import com.gyarsilalsolanki.docker_demo.entities.User;
import com.gyarsilalsolanki.docker_demo.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    private userService userService;

    @PostMapping("/register")
    private ResponseEntity<User> createUser(@RequestBody User user){

        userService.saveUser(user);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping("/all")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }
}
