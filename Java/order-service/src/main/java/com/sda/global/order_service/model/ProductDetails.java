package com.sda.global.order_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDetails {

    private Integer productId;
    private String name;
    private String type;
    private int price;
    private int count;
}
