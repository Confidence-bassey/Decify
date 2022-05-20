package com.alphainnovator.decify.service;

import java.util.List;
import java.util.Optional;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import com.alphainnovator.decify.core.Entities.OrderItemsEntity;
import com.alphainnovator.decify.core.Entities.ProductEntity;

import lombok.Data;

public interface OrderService {
  
  Optional<OrderEntity> getOrderById(int orderId);
  List<OrderEntity> getAllOrders();
  List<OrderItemsEntity> getOrderItems(int orderId);
  List<OrderEntity> getOrdersByCustomerId(int customerId);

  List<ProductEntity> getOrderProducts(int orderId);


  OrderCreateResult createNewOrder(int customerId);

}

@Data
class OrderCreateResult {
  private boolean status;
  private String statusMessage;
  private OrderEntity order;

  public OrderCreateResult() {}

  public OrderCreateResult(boolean status, String statusMsg) {
    this.status = status;
    this.statusMessage = statusMsg;

  } 

  public OrderCreateResult(boolean status, String statusMsg, OrderEntity orderEntity) {
    this.status = status;
    this.statusMessage = statusMsg;
    this.order = orderEntity;
  }
}  