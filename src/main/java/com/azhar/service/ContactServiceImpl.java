package com.azhar.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.azhar.entity.Contact;
import com.azhar.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService{

	@Autowired
	private ContactRepository contactRepo;
	
	@Override
	public boolean saveContact(Contact contact) {
	 contactRepo.save(contact);
	return false;
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> contactList= contactRepo.findAll();
		return contactList;
	}

	@Override
	public Contact getContactById(Integer contactId) {
		Optional<Contact> contactById=contactRepo.findById(contactId);
		return contactById.get();
	}

	@Override
	public boolean deleteContactById(Integer contactId) throws Exception 
	{
		Optional<Contact> deleteContact=contactRepo.findById(contactId);
		 if(deleteContact.isPresent()) 
	        {
			 contactRepo.deleteById(contactId);
	        } else {
	            throw new Exception("No Contact record exist for given id");
	        }
		return false;
	}

}
