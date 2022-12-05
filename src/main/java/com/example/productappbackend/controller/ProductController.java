package com.example.productappbackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @GetMapping("/")
    public String ProductHome(){
        return "Welcome to Products App";
    }

    @PostMapping("/add")
    public String AddProducts(){
        return "Add Products page";
    }

    @PostMapping("/search")
    public String SearchProducts(){
        return "Search Products";
    }

    @PostMapping("/edit")
    public String EditProducts(){
        return "Edit Products";
    }
}
