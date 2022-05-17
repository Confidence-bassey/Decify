package com.alphainnovator.decify.models;

import com.alphainnovator.decify.core.Entities.AdminEntity;
import com.alphainnovator.decify.core.Entities.CustomerEntity;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ServiceProviderModelDTO {
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Input{

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private double price;

    private  boolean isBooked;

    private AdminDTO.Input adminEntity;

    private CustomerDTO.Input customerEntity;

  }
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Output{

  }

}
