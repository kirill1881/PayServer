package com.example.demo.controller;

import com.example.demo.repos.JsonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class GetController {
    @Autowired
    JsonRepo jsonRepo;

    @GetMapping
    public String getData(){
        return jsonRepo.findAll().toString();
    }
}
