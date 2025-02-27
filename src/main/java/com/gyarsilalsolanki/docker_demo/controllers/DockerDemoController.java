package com.gyarsilalsolanki.docker_demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/docker")
public class DockerDemoController {
    @GetMapping("/status")
    public String check(){
        return "Your project dockerized successfully.";
    }
}
