package com.alphainnovator.decify.core.Entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderEntity {
  @Id
  private String id;
  
/*
  private List<ProductEntity> Products;
  private List<ServiceProviderEntity> serviceProviders;
  private CustomerEntity customer;
  public OrderEntity(List<ProductEntity> products,
      List<ServiceProviderEntity> serviceProviders) {
    Products = products;
    this.serviceProviders = serviceProviders;
  }   */

}
