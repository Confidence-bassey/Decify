package com.alphainnovator.decify.core.Entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.alphainnovator.decify.models.Enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "order")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {
  
  @Id 
  private int id;

  @JsonProperty("orderId")
  @Column(name="order_id")
  private String orderId;

  @JsonProperty("customerId")
  @Column(name="customer_id")
  private int customerId;

  @JsonProperty("orderDate")
  @Column(name="order_date")
  private Date orderDate;

  @JsonProperty("orderStatus")
  @Column(name="order_status")
  private OrderStatus orderStatus; 

  @JsonProperty("totalPrice")
  @Column(name="total_price")
  private double orderTotal ;

  @JsonProperty("discount")
  @Column(name="discount")
  private double discount;

}
