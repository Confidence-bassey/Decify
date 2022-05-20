package com.alphainnovator.decify.core.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
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

@Entity
@Table(name = "order_items")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItemsEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @JsonProperty("orderId")
  @Column(name="order_id")
  private int orderId;

  @JsonProperty("productId")
  @Column(name="product_id")
  private int productId;

  @ManyToOne
  @JoinColumn(referencedColumnName = "order_id")
  private OrderEntity Order;


  public OrderItemsEntity(int orderId, int productId) {
    this.orderId = orderId;
    this.productId = productId;
  }
}

