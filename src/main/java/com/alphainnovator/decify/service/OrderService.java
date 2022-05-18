package com.alphainnovator.decify.service;

import com.alphainnovator.decify.models.AddOrderModel;
import com.alphainnovator.decify.models.CartModel;
import com.alphainnovator.decify.models.PaymentModel;

public interface OrderService {
  AddOrderModel.Output addOrder(AddOrderModel.Input input);

  double addToCart(CartModel input);

  double pay(PaymentModel input);

 //ListOrderModel.Output getAllOrders(ListOrderModel.Input input, String customerId);

}
