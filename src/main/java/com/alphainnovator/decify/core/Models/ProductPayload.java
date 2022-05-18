package com.alphainnovator.decify.core.Models;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductPayload {
    
    @JsonProperty("productId")
    private long itemId;

    @JsonProperty("productId")
    private String description;

    @JsonProperty("productId")
    private String itemName;

    @JsonProperty("productId")
    private double itemPrice;
}
