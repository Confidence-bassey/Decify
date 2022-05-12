package com.alphainnovator.decify.core.Entities;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
public class AdminEntity {
    
    String firstName;
	 String lastName;
	 String email;
	 String phoneNo;
	List<String> payment = new ArrayList<String>();
	List<String> Products = new ArrayList<String>();
	List<String> ServiceProvider = new ArrayList<String>();

    
    public AdminEntity(String firstName, String lastName, String email, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    
}
