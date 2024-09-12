package com.orderservice.orderservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.orderservice.DTO.ProductDTO;
import com.orderservice.orderservice.client.ProductClient;
import com.orderservice.orderservice.model.OrderModel;
import com.orderservice.orderservice.repository.OrderRepository;

import java.util.List;

@Service
public class OrderService {
    

      @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private ProductClient productClient;

    public List<OrderModel> getAllOrders() {
        return orderRepository.findAll();
    }

    public OrderModel getOrderById(String id) {
        return orderRepository.findById(id).orElse(null);
    }

    public OrderModel addOrder(OrderModel order) {
        ProductDTO product = productClient.getProductById(order.getProductId());
        if (product != null) {
            return orderRepository.save(order);
        } else {
            throw new RuntimeException("Product not found");
        }
    }
}
