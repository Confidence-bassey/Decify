package com.alphainnovator.decify.core.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

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
    
    @JsonProperty("itemName")
    @Column(name = "item_name")
    String itemName;

    @JsonProperty("Idescription")
    @Column(name = "description")
    String description;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonProperty("productId")
    @Column(name = "item_id")
    int itemId;

    @JsonProperty("itemPrice")
    @Column(name = "item_price")
    double ItemPrice;

    @Column(name = "admin_id")
    int Admin_Id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="order_id")
    OrderEntity order;

    public ProductEntity(String itemName, String description, double itemPrice) {
        this.itemName = itemName;
        this.description = description;
        ItemPrice = itemPrice;
    }
    
}
