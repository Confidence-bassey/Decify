package com.alphainnovator.decify.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PaymentModel {
  private String  cardNumber;
  private String  amount;
  private String currency;
  private String redirectUrl;
  private String transRef;
  private String paymentOptions;
  private String customerEmail;
  private String customerName;
  private String customerPhoneNo;
  private String description;

}
