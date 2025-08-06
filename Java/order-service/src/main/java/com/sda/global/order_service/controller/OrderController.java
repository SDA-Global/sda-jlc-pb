package com.sda.global.order_service.controller;

import com.sda.global.order_service.Entity.OrderDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {


    public List<OrderDetails> getAllOrder(){
        return null;
    }

    public List<OrderDetails> getOrderByCustomer(@PathVariable Integer customerId){
        return null;
    }

    public ResponseEntity<String> bookOrder(@RequestBody OrderDetails orderDetails){
        return null;
    }
}
