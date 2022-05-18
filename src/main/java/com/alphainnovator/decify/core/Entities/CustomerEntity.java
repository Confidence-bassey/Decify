package com.alphainnovator.decify.core.Entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Entity
@Table(name ="customer")
@NoArgsConstructor
@ToString
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    int CId;
    
    @JsonProperty("firstName")
    @Column(name = "firstname")
    String firstName;

    @JsonProperty("lastName")
    @Column(name = "lastname")
    String lastName;

    @JsonProperty("email")
    @Column(name = "email")
    String email;

    @JsonProperty("phoneNo")
    @Column(name = "phone_number")
    String phoneNumber;

    @Column(name = "order_id")
    int order_id;

    @Column(name = "payment_id")
    int payment_id;
    
    public CustomerEntity(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    } 
    
}
