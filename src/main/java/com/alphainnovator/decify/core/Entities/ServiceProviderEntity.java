package com.alphainnovator.decify.core.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "serviceprovider")
@Data
@NoArgsConstructor
@AllArgsConstructor
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
