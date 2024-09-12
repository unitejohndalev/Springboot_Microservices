package com.productservice.productservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.productservice.productservice.model.ProductModel;
import com.productservice.productservice.repository.ProductRepository;

import java.util.List;


@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts() {
        return productRepository.findAll();
    }

    public ProductModel getProductById(String id) {
        return productRepository.findById(id).orElse(null);
    }

    public ProductModel addProduct(ProductModel product) {
        return productRepository.save(product);
    }
    
}
