package com.alphainnovator.decify.service;

import com.alphainnovator.decify.core.Entities.OrderEntity;
import com.alphainnovator.decify.core.Entities.ProductEntity;
import com.alphainnovator.decify.core.Entities.ServiceProviderEntity;
import com.alphainnovator.decify.dao.repositories.OrderRepository;
import com.alphainnovator.decify.dao.repositories.ProductRepository;
import com.alphainnovator.decify.dao.repositories.ServiceProviderRepository;
import com.alphainnovator.decify.models.AddOrderModel;
import com.alphainnovator.decify.models.CartModel;
import com.alphainnovator.decify.models.PaymentModel;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import lombok.var;

public class OrderServiceImpl implements OrderService {

  private final ServiceProviderRepository serviceProviderRepository;
  private final ProductRepository productRepository;
  private final OrderRepository orderRepository;


  public OrderServiceImpl(ServiceProviderRepository serviceProviderRepository,
      ProductRepository productRepository, com.alphainnovator.decify.dao.repositories.OrderRepository orderRepository) {
    this.serviceProviderRepository = serviceProviderRepository;
    this.productRepository = productRepository;
    this.orderRepository = orderRepository;
  }


  @Override
  public AddOrderModel.Output addOrder(AddOrderModel.Input input) {

    //todo product and service provider validations
    // check if order already exist if yes get order, of no then create order

    double total = 0.00;
    if (input.getProducts() != null || input.getServices() != null) {
      var totalProductPrice = input.getProducts().stream()
          .mapToDouble(ProductEntity::getItemPrice).sum();
      var totalServicePrice = input.getServices().stream()
          .mapToDouble(ServiceProviderEntity::getPrice).sum();
      total = totalProductPrice + totalServicePrice;

    }
    return new AddOrderModel.Output(input.getProducts(), input.getServices(), total);

  }

  @Override
  public double addToCart(CartModel input) {

    double productTotal = 0.00;
    double serviceTotal = 0.00;

    var productList = input.getOrders().stream()
        .map(OrderEntity::getProducts).collect(Collectors.toList());
    for (var items :productList ){
      productTotal = items.stream()
          .mapToDouble(ProductEntity::getItemPrice).sum();
    }
    var serviceProviderList = input.getOrders().stream()
        .map(OrderEntity::getServiceProviders).collect(Collectors.toList());
    for (var items :serviceProviderList ){
      serviceTotal = items.stream()
          .mapToDouble(ServiceProviderEntity::getPrice).sum();
    }

    return productTotal + serviceTotal;
  }

  @Override
  public double pay(PaymentModel input) {

    return 0;
  }

}
