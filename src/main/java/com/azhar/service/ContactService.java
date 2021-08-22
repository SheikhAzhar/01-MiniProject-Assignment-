package com.azhar.service;

import java.util.List;

import com.azhar.entity.Contact;


public interface ContactService {

	// record should be inserted 
		public boolean saveContact(Contact contact) ;
		
		// for retrieving record
		public List<Contact> getAllContacts();
		
		// by particular Id getting record
		public Contact getContactById(Integer contactId);
		
		// by particular Id deleting record
		public boolean deleteContactById(Integer contactId) throws Exception;
}
