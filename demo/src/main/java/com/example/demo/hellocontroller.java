package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "https://reactt-frontend-9c823267dbe6.herokuapp.com/")

@RestController
public class hellocontroller {
    @GetMapping ("/hello")
    public String hello(){
        return "Hello zakaria";
    }
}
