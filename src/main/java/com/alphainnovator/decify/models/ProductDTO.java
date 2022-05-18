package com.alphainnovator.decify.models;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class ProductDTO {
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Input{

    @NotNull
    private String name;
    @NotNull
    private double price;
    @NotNull
    private String description;

  }
  @Getter
  @Setter
  @NoArgsConstructor
  @AllArgsConstructor
  public static class Output{

  }

}
