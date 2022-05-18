package com.alphainnovator.decify.service;

import com.alphainnovator.decify.models.AddOrderModel;
import com.alphainnovator.decify.models.CartModel;

public interface OrderService {
  AddOrderModel.Output addOrder(AddOrderModel.Input input);

  double addToCart(CartModel input);

  double pay(double total);

 //ListOrderModel.Output getAllOrders(ListOrderModel.Input input, String customerId);

}
