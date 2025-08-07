package com.sda.global.product_service.service;

import com.sda.global.product_service.entity.ProductDetails;
import com.sda.global.product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<ProductDetails> getAllUser(){
        return productRepository.findAll();
    }

    public ProductDetails addProduct(ProductDetails userDetails){
        return productRepository.save(userDetails);
    }

    public ProductDetails getProductById(Integer productId) {
        return productRepository.getProductByProductId(productId);
    }
}
