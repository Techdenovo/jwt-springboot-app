package com.techdenovo.app.jwtspringbootapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceController {
    @GetMapping("/hiadmin")
    public String welcomeadmin(){
        return  "hello admin";
    }

    @GetMapping("/hiuser")
    public String welcomeuser(){
        return  "hellouser";
    }
}
