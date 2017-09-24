package com.unitedInt.inventory.dto;

import java.io.Serializable;

public class Product implements Serializable{
    private Long id;
    private String productName;
    private String quantityType;
    private Long quantity;
    private Double unitPrice;
    private Double pricePerCrtn;
    private Long quantityPerCrtn;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getQuantityType() {
        return quantityType;
    }

    public void setQuantityType(String quantityType) {
        this.quantityType = quantityType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getPricePerCrtn() {
        return pricePerCrtn;
    }

    public void setPricePerCrtn(Double pricePerCrtn) {
        this.pricePerCrtn = pricePerCrtn;
    }

    public Long getQuantityPerCrtn() {
        return quantityPerCrtn;
    }

    public void setQuantityPerCrtn(Long quantityPerCrtn) {
        this.quantityPerCrtn = quantityPerCrtn;
    }
}
