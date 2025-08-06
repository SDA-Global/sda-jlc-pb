package com.sda.global.product_service.controller;

import com.sda.global.product_service.Entity.ProductDetails;
import com.sda.global.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/prod/all")
    public List<ProductDetails> getUser(){
        return productService.getAllUser();
    }

    @PostMapping("/prod/add")
    public ProductDetails addUser(@RequestBody ProductDetails productDetails){
        return productService.addUser(productDetails);
    }
}
