package com.sda.global.product_service.repository;

import com.sda.global.product_service.Entity.ProductDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductDetails, Integer> {

    ProductDetails getProductByProductId(Integer productId);
}
