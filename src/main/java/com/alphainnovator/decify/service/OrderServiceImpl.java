package com.alphainnovator.decify.service;

/*import com.alphainnovator.decify.core.Entities.ProductEntity;
import com.alphainnovator.decify.core.Entities.ServiceProviderEntity;
import com.alphainnovator.decify.dao.repositories.OrderRepository;
import com.alphainnovator.decify.dao.repositories.ProductRepository;
import com.alphainnovator.decify.dao.repositories.ServiceProviderRepository;
import java.util.stream.Collectors;
import lombok.var;

/*public class OrderServiceImpl implements OrderService {
  private final ServiceProviderRepository  serviceProviderRepository;
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

    var productEntityList = input.getProducts().stream()
        .map(product -> new ProductEntity(product.getName(),product.getPrice(), product.getDescription()))
        .collect(Collectors.toList());
    var serviceProviderEntityList = input.getServices().stream()
        .map(item ->
          new ServiceProviderEntity(item.getName(),item.getDescription(),item.getPrice()))
        .collect(Collectors.toList());


    productRepository.saveAll(productEntityList);
    serviceProviderRepository.saveAll(serviceProviderEntityList);

    return  new AddOrderModel.Output(input.getProducts(),input.getServices());
  }

  @Override
  public void getOrderByiD() {

  }

}*/
