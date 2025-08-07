package com.sda.global.product_service.controller;

import com.sda.global.product_service.Entity.ProductDetails;
import com.sda.global.product_service.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public ProductDetails addProduct(@RequestBody ProductDetails productDetails){
        return productService.addProduct(productDetails);
    }

    @GetMapping("/prod/{productId}")
    public ProductDetails getProductById(@PathVariable Integer productId) {
        return productService.getProductById(productId);
    }
}
