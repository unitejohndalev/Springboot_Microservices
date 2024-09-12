package com.inventoryservice.inventoryservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventoryservice.inventoryservice.model.InventoryModel;
import com.inventoryservice.inventoryservice.repository.InventoryRepository;

import java.util.List;

@Service

public class InventoryService {
    

        @Autowired
    private InventoryRepository inventoryRepository;

    public List<InventoryModel> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public InventoryModel getInventoryByProductId(String productId) {
        return inventoryRepository.findById(productId).orElse(null);
    }

    public InventoryModel updateInventory(String productId, int quantity) {
        InventoryModel inventory = inventoryRepository.findById(productId).orElseThrow(() -> new RuntimeException("Product not found"));
        inventory.setQuantity(quantity);
        return inventoryRepository.save(inventory);
    }
}
