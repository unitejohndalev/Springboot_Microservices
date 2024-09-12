package com.inventoryservice.inventoryservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class InventoryModel {

    @Id
    private String productId;
    private int quantity;


    public String getProductId() {
        return this.productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    
}
