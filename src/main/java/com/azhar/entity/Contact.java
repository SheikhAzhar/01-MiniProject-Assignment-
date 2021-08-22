package com.azhar.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

//@Table(name = "CONTACT_DTLS") it is optional , 
// if not give it will consider class name as table name
// for defining Table Name as per requirement then we will write @Table(name="")

@Entity
@Table(name = "CONTACT_DTLS")
@Data  // used to generate Setters and Getters for given variables
public class Contact {
    
	@Id             // variable mapped with primary key
	@GeneratedValue //primary key value generated automatically
	@Column(name = "CONTACT_ID") // optional variable name will be considered
	private Integer contactId;
	
	@Column(name = "CONTACT_NAME")
	private String 	contactName;
	
	@Column(name = "CONTACT_EMAIL")
	private String 	contactEmail;
	
	@Column(name = "CONTACT_NUMBER")
	private Long 	contactNumber;
	
	@Column(name = "ACTIVE_SW")
	private Character activeSwitch;
	
	@Column(name = "CREATED_DATE")
	private LocalDate createdDate;
	
	@Column(name = "UPDATED_DATE")
	private LocalDate updatedDate;
	
	
}
