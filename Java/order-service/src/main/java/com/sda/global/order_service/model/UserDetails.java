package com.sda.global.order_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetails {

    private Integer userId;
    private String name;
    private int age;
    private String email;
    private String passcode;
}
