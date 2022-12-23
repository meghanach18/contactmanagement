package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.client.RestTemplate;

import com.example.user.model.Contact;
import com.example.user.repository.ContactRepository;


@SpringBootApplication
//@ImportResource("classpath:contact.xml")
public class ContactManagementApplication  {
	//implements CommandLineRunner
	public static void main(String[] args) {
		SpringApplication.run(ContactManagementApplication.class, args);
		
		
	}
	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		
		return restTemplate;
	}
	
	
//	@Autowired
//	private ContactRepository contactRepository;
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Contact contact1=new Contact(1,"meghana",23,"bangalore","female","yes","java",50,13.56579,"pune");
//		Contact contact2=new Contact(2,"sai",23,"hyderbad","female","yes","java",50,13.56579,"pune");
//		
//		contactRepository.save(contact1);
//		contactRepository.save(contact2);
//	}

}
