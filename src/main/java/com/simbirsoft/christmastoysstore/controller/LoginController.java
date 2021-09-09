package com.simbirsoft.christmastoysstore.controller;

import com.simbirsoft.christmastoysstore.service.helloworld.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/login")
public class LoginController {

    @Autowired
    HelloWorldService helloWorldService;

    @GetMapping
    public String login() {
        return helloWorldService.getHello();
    }


}
