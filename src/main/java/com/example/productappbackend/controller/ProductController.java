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
    public String AddProduct(){
        return "Add Products page";
    }

    @PostMapping("/search")
    public String SearchProduct(){
        return "Search Products";
    }

    @PostMapping("/edit")
    public String EditProduct(){
        return "Edit Products";
    }

    @GetMapping("/view")
    public String ViewProducts(){
        return "View Products";
    }
}
