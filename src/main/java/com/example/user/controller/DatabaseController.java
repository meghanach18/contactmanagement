package com.example.user.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import com.example.user.model.Contact;
import com.example.user.model.Location;
import com.example.user.model.RandomuserApiResponse;
import com.example.user.service.ContactService;


@Controller
@RequestMapping("/contact")
public class DatabaseController {
	@Autowired
	ContactService contactService;
	@RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
  ModelAndView model = new ModelAndView("datatable");
  NumberConversion service = new NumberConversion();
  
  NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);		

	  //List<Contact> contactList = contactService.getAllContact();
  List<Contact> ContactList = contactService.getAllContact();
	  //soap
	  for(Contact contact: ContactList){
		  
System.out.println(contact.getPercentage());
	  BigInteger number = BigInteger.valueOf(contact.getPercentage());
		String numberToWords =port.numberToWords(number);
     contact.setPercentageinWords(numberToWords);
     //rest
     Contact contactIp= contactService.invokeRestService();
     contact.setIp(contactIp.getIp());
     //rest
   Contact contactAge  =contactService.restService(contact);
   contact.setAge(contactAge.getAge());
   //contact.setCount(contactAge.getCount());
   RandomuserApiResponse  r= contactService.RestAPI();
	 Location location=r.getResults().get(0).getLocation();
	 model.addObject("ContactList", location.getCountry());
	 System.out.println(location.getCountry());
	 contact.setLocation(location.getCountry());
   
     }
	  
	   //List<Contact> ContactList = contactService.getAllContact();
	  model.addObject("ContactList", ContactList);
	  model.setViewName("datatable");
	System.out.println(ContactList);
	  return model;
	 }
	
	 @RequestMapping(value="/addContact", method=RequestMethod.GET)
	 public ModelAndView addContact() {
	  ModelAndView model = new ModelAndView();
	  
	  Contact contact = new Contact();
	  
	  model.addObject("contactForm", contact);
	  model.setViewName("contact_form");
	  return model;
	 }
	 @RequestMapping(value="/saveContact", method=RequestMethod.POST)
	 public ModelAndView save(@ModelAttribute("contactForm") Contact contact) {
	
	  contactService.saveOrUpdate(contact);
  
	  return new ModelAndView("redirect:/contact/list");
	 }
	 
//	 @RequestMapping(value="/", method=RequestMethod.POST)
//	 public ModelAndView save (@ModelAttribute("contactForm")Contact contact) {
//		return null;
//	 }
	 
	 @RequestMapping(value="/updateContact/{id}", method=RequestMethod.GET)
	 public ModelAndView editContact(@PathVariable int id) {
	  ModelAndView model = new ModelAndView();
	  Contact contact = contactService.getContactById(id);
	  model.addObject("contactForm", contact);
	  model.setViewName("contact_form");
	  
	  return model;
 }
	 
	 @RequestMapping(value="/deleteContact/{id}", method=RequestMethod.GET)
	 public ModelAndView delete(@PathVariable("id") int id) {
	  contactService.deleteContact(id);
	  
	  return new ModelAndView("redirect:/contact/list");
	 }
	 
	 
	 
	
	
}
	 
	
