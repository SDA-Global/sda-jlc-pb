package com.sda.global.order_service.service;

import com.sda.global.order_service.entity.OrderDetails;
import com.sda.global.order_service.feign.ProductFeign;
import com.sda.global.order_service.feign.UserFeign;
import com.sda.global.order_service.model.BookingStatus;
import com.sda.global.order_service.model.ProductDetails;
import com.sda.global.order_service.model.UserDetails;
import com.sda.global.order_service.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserFeign userFeign;

    @Autowired
    ProductFeign productFeign;

    public List<OrderDetails> getAllOrder(){
        return orderRepository.findAll();
    }

    public List<OrderDetails> getOrderByCustomer(Integer customerId){
        return orderRepository.findByCustomerId(customerId);
    }

    public UserDetails getUserById(Integer userId) {
        return userFeign.getUserById(userId);
    }

    public ProductDetails getProductById(Integer productId) {
        return productFeign.getProductById(productId);
    }

    public String bookOrder(OrderDetails orderDetails) {
        //fetch user details
        UserDetails userDetails = getUserById(orderDetails.getCustomerId());
        if (userDetails == null) {
            return "User not found with ID: " + orderDetails.getCustomerId();
        }
        //fetch product details
        ProductDetails productDetails = getProductById(orderDetails.getProductId());
        if (productDetails == null) {
           return "Product not found with ID: " + orderDetails.getProductId();
        }
        if(productDetails.getCount() > 0) {
            productDetails.setCount(productDetails.getCount() - 1);
            orderDetails.setOrderStatus(BookingStatus.COMPLETED.name());
            orderDetails.setActive(true);
            orderDetails.setTotalFare(productDetails.getPrice());
            //update product count
            productFeign.addProduct(productDetails);
            //save order details
            orderRepository.save(orderDetails);
        } else {
            orderDetails.setOrderStatus(BookingStatus.FAILED.name());
            orderDetails.setActive(true);
            orderDetails.setTotalFare(0);
            orderRepository.save(orderDetails);
            return "Product is out of stock";
        }
          return "Order booked successfully with ID: " + orderDetails.getOrderId();
    }
}
