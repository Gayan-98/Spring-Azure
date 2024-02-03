package com.senmash.azuredemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Api {

    @GetMapping("/azure")
    public String welcome(){
        return "Successfully deployed on to azure";
    }

}
