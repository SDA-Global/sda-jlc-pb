package com.sda.global.order_service.repository;

import com.sda.global.order_service.entity.OrderDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<OrderDetails, Integer> {

    List<OrderDetails> findByCustomerId(Integer customerId);
}
