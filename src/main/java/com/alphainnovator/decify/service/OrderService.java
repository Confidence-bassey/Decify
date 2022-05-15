package com.alphainnovator.decify.service;

import com.alphainnovator.decify.models.AddOrderModel;

public interface OrderService {
  AddOrderModel.Output addOrder(AddOrderModel.Input input);
  void getOrderByiD();
  void getAllOrders();

}
