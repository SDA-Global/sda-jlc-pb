package com.sda.global.order_service.controller;

import com.sda.global.order_service.Entity.OrderDetails;
import com.sda.global.order_service.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/ord/all")
    public List<OrderDetails> getAllOrder(){
        return orderService.getAllOrder();
    }

    @GetMapping("/ord/{customerId}")
    public List<OrderDetails> getOrderByCustomer(@PathVariable Integer customerId){
        return orderService.getOrderByCustomer(customerId);
    }

    @PostMapping("/ord/book")
    public ResponseEntity<String> bookOrder(@RequestBody OrderDetails orderDetails){
        String response = orderService.bookOrder(orderDetails);
        return ResponseEntity.ok(response);
    }
}
