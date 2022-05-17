package com.alphainnovator.decify.service;

import com.alphainnovator.decify.models.AddOrderModel;
import com.alphainnovator.decify.models.ListOrderModel;

public interface OrderService {
  AddOrderModel.Output addOrder(AddOrderModel.Input input);
  void getOrderByiD();

 ListOrderModel.Output getAllOrders(ListOrderModel.Input input, String customerId);

}
