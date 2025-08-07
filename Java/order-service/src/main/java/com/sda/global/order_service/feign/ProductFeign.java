package com.sda.global.order_service.feign;

import com.sda.global.order_service.model.ProductDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "PRODUCT-SERVICE", path = "/prod")
public interface ProductFeign {

    @GetMapping("/{productId}")
    ProductDetails getProductById(@PathVariable Integer productId);

    @PostMapping("/add")
    ProductDetails addProduct(@RequestBody ProductDetails productDetails);
}
