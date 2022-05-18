package com.alphainnovator.decify.core.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "service_provider")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProviderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "service_provider_id")
  private String id;

  private String name;
  private String description;
  private double price;
  private  boolean isBooked;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="order_id")
  OrderEntity order;

  private AdminEntity adminEntity;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name="customer_id")
  private CustomerEntity customerEntity;

  public ServiceProviderEntity(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
}
