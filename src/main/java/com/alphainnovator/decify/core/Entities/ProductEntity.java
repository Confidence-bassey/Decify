package com.alphainnovator.decify.core.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductEntity {
    
    @Column(name = "item_name")
    String itemName;

    @Column(name = "description")
    String description;

    @Column(name = "item_id")
    long itemId;

    @Column(name = "item_price")
    double ItemPrice;

    @Column(name = "admin_id")
    int Admin_Id;

    public ProductEntity(String itemName, String description, double itemPrice) {
        this.itemName = itemName;
        this.description = description;
        ItemPrice = itemPrice;
    }
    
}
