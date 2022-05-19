package com.alphainnovator.decify.core.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ServiceProviderEntity {
  @Id
  private String id;
  private String name;
  private String description;
  private double price;
  private  boolean isBooked;
  private int adminId;
  private int customerId;

  public ServiceProviderEntity(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
}
