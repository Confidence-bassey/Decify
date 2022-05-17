package com.alphainnovator.decify.models;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CartModel {

  private List<OrderEntity> orders;
  private double total;

}
