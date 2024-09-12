package com.inventoryservice.inventoryservice.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.inventoryservice.inventoryservice.model.InventoryModel;
import com.inventoryservice.inventoryservice.service.InventoryService;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

      @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<InventoryModel> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    @GetMapping("/{productId}")
    public InventoryModel getInventoryByProductId(@PathVariable String productId) {
        return inventoryService.getInventoryByProductId(productId);
    }

    @PutMapping("/{productId}")
    public InventoryModel updateInventory(@PathVariable String productId, @RequestParam int quantity) {
        return inventoryService.updateInventory(productId, quantity);
    }
    
}
