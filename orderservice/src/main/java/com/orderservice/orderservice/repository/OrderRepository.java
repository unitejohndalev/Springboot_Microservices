package com.orderservice.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.orderservice.orderservice.model.OrderModel;

public interface OrderRepository extends JpaRepository<OrderModel, String> {
    
}
