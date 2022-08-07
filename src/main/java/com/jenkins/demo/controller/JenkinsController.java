package com.jenkins.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JenkinsController {

    @GetMapping("/hello")
    public String Shew(){
        return "Jenkins JenkinsController";
    }
}
