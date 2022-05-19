package com.alphainnovator.decify.core.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

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
  int id;
  int customer_id;
  String delivery_status;
  double total_price;
  double discount;
}
