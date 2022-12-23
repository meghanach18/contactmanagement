package com.example.user.repository;

import java.util.List; 
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.model.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	public List<Contact> findByOrderByIdDesc();

	//public List<Contact> findByContactIdOrderByCreatedDateDesc();
	
}

	

	
	
