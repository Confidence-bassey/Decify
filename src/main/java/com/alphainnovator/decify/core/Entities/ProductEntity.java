package com.alphainnovator.decify.core.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ProductEntity {
  @Id
  private String id;
  private String name;
  private double price;
  private String description;
  private  AdminEntity admin;

  public ProductEntity(String name, double price, String description) {
    this.name = name;
    this.price = price;
    this.description = description;
  }
}
