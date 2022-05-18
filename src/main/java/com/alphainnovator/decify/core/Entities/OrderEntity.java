package com.alphainnovator.decify.core.Entities;

import com.alphainnovator.decify.apis.Controllers.ProductController;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name ="order")
@NoArgsConstructor
public class OrderEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "order_id")
  private String id;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
  private List<ProductEntity> Products;

  @OneToMany(fetch = FetchType.EAGER, mappedBy = "order")
  private List<ServiceProviderEntity> serviceProviders;

@ManyToOne(fetch = FetchType.LAZY)
@JoinColumn(name = "customer_id")
  private CustomerEntity customer;

  public OrderEntity(List<ProductEntity> products,
      List<ServiceProviderEntity> serviceProviders) {
    Products = products;
    this.serviceProviders = serviceProviders;
  }



}
