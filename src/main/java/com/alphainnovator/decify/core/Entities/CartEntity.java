package com.alphainnovator.decify.core.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cart")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartEntity {

    @Id
    @JsonProperty("cartId")
    @Column(name = "id")
    private int id;
  
    @JsonProperty("productId")
    @Column(name="product_id")
    public int productId;
  
    @JsonProperty("customerId")
    @Column(name="customer_id")
    public int customerId;
  
    @JsonProperty("dateAdded")
    @Column(name="added_date")
    public Date dateAdded;
    
}
