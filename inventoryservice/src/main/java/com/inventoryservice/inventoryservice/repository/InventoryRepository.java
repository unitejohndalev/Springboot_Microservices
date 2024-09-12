package com.inventoryservice.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventoryservice.inventoryservice.model.InventoryModel;

public interface InventoryRepository extends JpaRepository<InventoryModel, String> {
    
}
