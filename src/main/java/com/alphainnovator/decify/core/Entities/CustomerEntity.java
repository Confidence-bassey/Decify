package com.alphainnovator.decify.core.Entities;


//import javax.persistence.Entity;
//import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
//@Table(name = "customer")
//@Entity
@NoArgsConstructor
@ToString
public class CustomerEntity {
    
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    int order_id;
    
    public CustomerEntity(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    
    
}
