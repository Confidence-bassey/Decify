package com.alphainnovator.decify.core.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@ToString
public class AdminEntity {
    

    @Column(name = "admin_id")
    int AdminId;

    @Column(name = "firstname")
    String firstName;

    @Column(name = "lastname")
	String lastName;

    @Column(name = "email")
	String email;

    @Column(name = "phone_number")
	String phoneNo;

    @Column(name = "payment_id")
    int payment_id;

    @Column(name = "product_id")
    int product_id;

    @Column(name = "service_id")
    int service_id;

    
    public AdminEntity(String firstName, String lastName, String email, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNo = phoneNo;
    }

    
}
