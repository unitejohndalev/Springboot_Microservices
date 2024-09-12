package com.orderservice.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.orderservice.orderservice.model.OrderModel;
import com.orderservice.orderservice.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/orders")

public class OrderController {


     @Autowired
    private OrderService orderService;

    @GetMapping
    public List<OrderModel> getAllOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public OrderModel getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id);
    }

    @PostMapping
    public OrderModel addOrder(@RequestBody OrderModel order) {
        return orderService.addOrder(order);
    }
    
}
