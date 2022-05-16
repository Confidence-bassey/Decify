package com.alphainnovator.decify.core.Entities;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Entity
//@Table(name = "product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductEntity {
    
    String itemName;
    String description;
    long itemId;
    double ItemPrice;

    public ProductEntity(String itemName, String description, double itemPrice) {
        this.itemName = itemName;
        this.description = description;
        ItemPrice = itemPrice;
    }
    
}
