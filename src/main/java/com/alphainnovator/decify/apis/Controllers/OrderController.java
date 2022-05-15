package com.alphainnovator.decify.apis.Controllers;

import com.alphainnovator.decify.models.AddOrderModel;
import com.alphainnovator.decify.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping
  public AddOrderModel.Output addOrder(@RequestBody AddOrderModel.Input input
  ) {
    return orderService.addOrder(input);

  }

}
