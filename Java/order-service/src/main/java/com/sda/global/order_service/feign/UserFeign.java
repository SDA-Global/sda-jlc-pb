package com.sda.global.order_service.feign;

import com.sda.global.order_service.model.UserDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "USER-SERVICE", path = "/user")
public interface UserFeign {

    @GetMapping("/{userId}")
    UserDetails getUserById(@PathVariable Integer userId);
}
