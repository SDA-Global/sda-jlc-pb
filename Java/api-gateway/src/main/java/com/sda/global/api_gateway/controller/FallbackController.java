package com.sda.global.api_gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/userFallback")
    public Mono<String> userFallback(){
        return Mono.just("User service is down, please try in sometime!");
    }

    @RequestMapping("/prodFallback")
    public Mono<String> productFallback(){
        return Mono.just("Product service is down, please try in sometime!");
    }

    @RequestMapping("/ordFallback")
    public Mono<String> orderFallback(){
        return Mono.just("Order service is down, please try in sometime!");
    }

}
