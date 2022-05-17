package com.alphainnovator.decify.core.Entities;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import org.hibernate.annotations.GeneratorType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "admin")
@Data
@NoArgsConstructor
@ToString
public class AdminEntity {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "admin_id")
    int AdminId;

    @JsonProperty("firstName")
    @Column(name = "firstname")
    String firstName;

    @JsonProperty("lastName")
    @Column(name = "lastname")
	String lastName;

    @JsonProperty("Email")
    @Column(name = "email")
	String email;

    @JsonProperty("phoneNo")
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
