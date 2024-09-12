package com.orderservice.orderservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.orderservice.orderservice.DTO.ProductDTO;

@FeignClient(name = "productservice")
public interface ProductClient {

       @GetMapping("/products/{id}")
    ProductDTO getProductById(@PathVariable String id);
    
}
