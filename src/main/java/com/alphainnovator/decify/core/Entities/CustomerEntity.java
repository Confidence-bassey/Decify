package com.alphainnovator.decify.core.Entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class CustomerEntity {
    
    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    List<String> orders = new ArrayList<>();
    
    public CustomerEntity(String firstName, String lastName, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    
    
}
