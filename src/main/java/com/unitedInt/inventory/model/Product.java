package com.unitedInt.inventory.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/*
* 23-09-2017
* Author Muhammad Zohaib Baig
* */
@Entity
@Table(name = "PRODUCT")
public class Product extends BaseEntityAudit {

    @Column(name = "PRODUCT_NAME", unique = true, nullable = false)
    private String productName;
    @Column(name = "QUANTITY_TYPE")
    private String quantityType;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "UNIT_PRICE", nullable = false)
    private Double unitPrice;
    @Column(name = "PRICE_PER_CARTON")
    private Double pricePerCrtn;
    @Column(name = "QUANTITY_PER_CARTON")
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
