package com.alphainnovator.decify.core.Entities;

//import javax.persistence.Entity;
//import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

//@Entity
//@Table(name = "admin")
@Data
@NoArgsConstructor
@ToString
public class AdminEntity {
    
    int Id;
    int AdminId;

    String firstName;
	String lastName;
	String email;
	String phoneNo;
    int payment_id;
    int product_id;

    
    public AdminEntity(String firstName, String lastName, String email, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    
}
