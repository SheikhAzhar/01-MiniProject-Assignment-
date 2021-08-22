package com.azhar.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.azhar.entity.Contact;
 
// @Repository optional because we extends JpaRepository which is special interface
@Repository
public interface ContactRepository extends JpaRepository<Contact, Serializable> {
    
		
	
}
