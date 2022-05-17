package com.alphainnovator.decify.service;

import com.alphainnovator.decify.core.Entities.ProductEntity;
import com.alphainnovator.decify.dao.repositories.ProductRepository;
import com.alphainnovator.decify.dao.repositories.ServiceProviderRepository;
import com.alphainnovator.decify.models.AddOrderModel;
import com.sun.tools.javac.util.List;
import lombok.var;

public class OrderServiceImpl implements OrderService {
  private final ServiceProviderRepository  serviceProviderRepository;
  private final ProductRepository productRepository;

  public OrderServiceImpl(ServiceProviderRepository serviceProviderRepository,
      ProductRepository productRepository) {
    this.serviceProviderRepository = serviceProviderRepository;
    this.productRepository = productRepository;
  }


  @Override
  public AddOrderModel.Output addOrder(AddOrderModel.Input input) {

    var productEntities = input.getProducts(); //todo call the product repository
    var productIds = List.of("");

    var productEntity = productRepository.findAll();
    var serviceProviderEntity = serviceProviderRepository.findAll();


    return AddOrderModel.Output("");
  }

  @Override
  public void getOrderByiD() {

  }

  @Override
  public void getAllOrders() {

  }
}
