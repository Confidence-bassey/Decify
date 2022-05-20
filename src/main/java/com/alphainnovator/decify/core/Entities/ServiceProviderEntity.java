package com.alphainnovator.decify.core.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

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
  @JsonProperty("serviceId")
  @Column(name = "service_id")
  private int id;

  @JsonProperty("serviceName")
  @Column(name = "servicename")
  private String name;

  @JsonProperty("service_description")
  @Column(name = "service_desc")
  private String description;

  @JsonProperty("service_price")
  @Column(name = "serviceprice")
  private double price;

  @JsonProperty("serviceStatus")
  @Column(name = "service_pstatus")
  private  boolean isBooked;

  @JsonProperty("adminId")
  @Column(name = "admin_id")
  private int adminId;

  @JsonProperty("customerId")
  @Column(name = "customer_id")
  private int customerId;

  public ServiceProviderEntity(String name, String description, double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }
}
