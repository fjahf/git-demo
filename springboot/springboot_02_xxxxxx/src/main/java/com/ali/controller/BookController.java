package com.ali.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @RequestMapping()
    public String getById(){
        System.out.println("SpringBoot is running...1");
        return "SpringBoot is running ... 1";
    }
}
