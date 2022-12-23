package com.example.user.service;

import java.net.http.HttpHeaders;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;


import com.example.user.model.Contact;
import com.example.user.model.Location;
import com.example.user.model.RandomuserApiResponse;
import com.example.user.model.Rest;
import com.example.user.repository.ContactRepository;


@Service
public class ContactService {
	@Value("${data.url}")
	private  String data;
	@Value("${rest.url}")
	private String rest;

	@Value("${api.url}")
	private String api;
	
@Autowired
 private ContactRepository contactRepository;

@Autowired
RestTemplate restTemplate;

	public Contact saveContact(Contact contact) {
		return contactRepository.save(contact);
		
	}

public List<Contact> getAllContact() {
	 List<Contact> contactList=contactRepository.findByOrderByIdDesc();
//	 contactList.sort(Comparator.comparing(Contact::getId).reversed());
//	List<Integer> listids=new ArrayList<>();
//
//for(Contact contact:contactList) {
//	int i;
//	i=contact.getId();
//	listids.add(i);
//	}
//Collections.sort(listids);
//System.out.println(listids);
//List<Contact> val=new ArrayList<>();
// for(Integer id:listids) {
//	 for(Contact contact:contactList) {
//		 
//	
//}}
	return contactList;

}

public void saveOrUpdate(Contact contact) {
	  contactRepository.save(contact);;
	
}

public Contact getContactById(int id) {
	return contactRepository.findById(id).get();
	
}

public void deleteContact(int id) {
	contactRepository.deleteById(id);

	
}




public Contact invokeRestService() {
	// TODO Auto-generated method stub
Contact contact = new Contact();
	try {
	ResponseEntity<Contact>	result=restTemplate.getForEntity(data,Contact.class);
		System.out.println(data);
	System.out.println(result);
	contact=result.getBody();
		
	
		} 
		catch (RestClientException  e) {
			e.printStackTrace();
				
			}
			return contact;
	
}

public Contact restService(Contact contact) {
	// TODO Auto-generated method stub
	Contact contactAge =new  Contact();
	try
	{
		ResponseEntity<Contact>	output=restTemplate.getForEntity(rest+contact.getName(),Contact.class);
		System.out.println(rest);
		contactAge = output.getBody();
		
	}
	catch (RestClientException  e) {
		e.printStackTrace();
			
		}
	return contactAge;
}
//
//public 	RandomuserApiResponse RestAPI() {
//	// TODO Auto-generated method stub
//	
//	RandomuserApiResponse  r =new  	RandomuserApiResponse();
//	try
//	{
//		System.out.println(api);
//		
//		ResponseEntity<RandomuserApiResponse>	output=restTemplate.getForEntity(api, RandomuserApiResponse.class);
//		System.out.println(output.getBody());
//		org.springframework.http.HttpHeaders headers = output.getHeaders();
//
//		  r= output.getBody(); 
//	System.out.println(r);
//		
//		
//	}
//	catch (RestClientException  e) {
//		e.printStackTrace();
//			
//		}
//	return r;
//	
//}

public RandomuserApiResponse RestAPI() {
	// TODO Auto-generated method stub
	RandomuserApiResponse  r =new  	RandomuserApiResponse();
try
	{
		System.out.println(api);
		
		ResponseEntity<RandomuserApiResponse>	output=restTemplate.getForEntity(api, RandomuserApiResponse.class);
		System.out.println(output.getBody());
	org.springframework.http.HttpHeaders headers = output.getHeaders();

		  r= output.getBody(); 
	System.out.println(r);
		
	}
	catch (RestClientException  e) {
		e.printStackTrace();
		
		}
	return r;
	

}















}








