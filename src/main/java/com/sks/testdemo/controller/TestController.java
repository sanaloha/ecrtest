package com.sks.testdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/")
public class TestController {
    @GetMapping("/demo")
public String tesDemo(){

    return "welcome to Spring Boot";
}

}
