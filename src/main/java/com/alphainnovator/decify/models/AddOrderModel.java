package com.alphainnovator.decify.models;

import com.alphainnovator.decify.core.Entities.ProductEntity;
import com.alphainnovator.decify.core.Entities.ServiceProviderEntity;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.lang.Nullable;

public class AddOrderModel {
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Input{

    @Nullable
  private List<ProductEntity> products;

    @Nullable
  private List<ServiceProviderEntity> services;

  }
  @Getter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Output{

    private List<ProductEntity> products;

    private List<ServiceProviderEntity> services;

    private double total;

  }

}
