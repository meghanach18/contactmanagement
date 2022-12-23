package com.example.user.controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dataaccess.webservicesserver.NumberConversion;
import com.dataaccess.webservicesserver.NumberConversionSoapType;
import com.example.user.excel.contactExcelExporter;
//import com.example.user.excel.contactExcelExporter;
//import com.example.user.excel.ContactExcelExporter;
import com.example.user.model.Contact;
import com.example.user.model.Location;
import com.example.user.model.RandomuserApiResponse;
import com.example.user.service.ContactService;


@Controller
public class ContactController {

	
	
	@Autowired
	 private ContactService contactService;
	
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	 public ModelAndView list() {
	  ModelAndView model = new ModelAndView("contact_list");
		//ModelAndView model = new ModelAndView("datatable");
	  NumberConversion service = new NumberConversion();
   
  NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);		

	  List<Contact> contactList = contactService.getAllContact();
	  //soap
	  for(Contact contact: contactList){
		  
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
	 model.addObject("contactList", location.getCountry());
	 System.out.println(location.getCountry());
	 contact.setLocation(location.getCountry());
   
     }
	  

	  System.out.println(contactList);
	  

	
	 
	  
	  model.addObject("contactList", contactList);
	  model.setViewName("contact_list");
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
	  
	  return new ModelAndView("redirect:/list");
	 }
	 
//	 @RequestMapping(value="/text", method=RequestMethod.GET)
//	 public ModelAndView file(@ModelAttribute("contactForm") Contact contact) {
//	contact.setId(0);
//
//	  contactService.saveOrUpdate(contact);
//	  
//	  return new ModelAndView("redirect:/list");
//	 }
	


//	@RequestMapping(value="",method=RequestMethod.POST)
//	public ModelAndView save(@ModelAttribute("") Contact contact) {
//}
	 
	
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
	  
	  return new ModelAndView("redirect:/list");
	 }
	 
	
	




	@GetMapping("/registration")
    public String registration(Model model) {
		
        model.addAttribute("contact", new Contact());

        return "registration";
    }
		
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("contact") Contact contact) {
//		NumberConversion service = new NumberConversion();
//		   
//		  NumberConversionSoapType port = service.getPort(NumberConversionSoapType.class);		

	System.out.println(contact);
//	for(Contact contact: contactList){
//		System.out.println(contact.getPercentage());
//			  BigInteger number = BigInteger.valueOf(contact.getPercentage());
//				
//			  String numberToWords =port.numberToWords(number);
//			  System.out.println(numberToWords);
//			  
//		    contact.setPercentageinWords(numberToWords);
//			 }
	contactService.saveContact(contact);
	return "redirect:/list";
	}
	
//@GetMapping("/country")
//public ModelAndView country() {
//	ModelAndView model = new ModelAndView();
//	 RandomuserApiResponse  r= contactService.RestAPI();
//	 Location location=r.getResults().get(0).getLocation();
//	  model.addObject("contactList", location.getCountry());
	 // model.setViewName("contact_list");
//	System.out.println(location.getCountry());
//	
//	return model;
	
//}
//	
//	@GetMapping("/contact/export")
//	public void exportToExcel(HttpServletResponse response) throws IOException{
//	response.setContentType("/application/octet-stream");
//		String headerKey ="Content-Disposition";
//		
//		DateFormat dateFormatter= new SimpleDateFormat("YYY-MM-dd_HH:mm:ss");
//		String currentDateTime  = dateFormatter.format(new java.util.Date());
//		String fileName = "contact_"+currentDateTime+".xlsx";
//		String headervalue="attachment;filename="+fileName;
//		response.setHeader(headerKey, headervalue);
//		List<Contact> listContact =contactService.getAllContact();
//		Conta
//		 FileReader file = new FileReader("\"C:\\Users\\CSAIMEGH\\Desktop\\document.txt\"");
//		 BufferedReader br = new BufferedReader(file);
//		 String str;
//		 while ((str=br.readLine())!= null)
//		 {
//			 System.out.println(str);
//		 }
//		 br.close();
//	 },
//		 File file= new File("C:\\Users\\CSAIMEGH\\Desktop\\document.txt\"");
//		 Scanner sc=new Scanner(file);
//		 while(sc.hasNextLine())
//		 {
//			 System.out.println(sc.nextLine());
//		 }
//	return "ReadTextFile";
//}	
//		 
//		 String fileName = "data.txt";
//		 File file = new File(fileName);
//		 FileInputStream fis = new FileInputStream(file);
//		 String cs;
//		InputStreamReader isr = new InputStreamReader(fis, cs);
//		 BufferedReader br = new BufferedReader(isr);
//
//		 String line;
//		 while((line = br.readLine()) != null){
//		      //process the line
//		      System.out.println(line);
//		 }
//		 br.close();
//}
	
	@RequestMapping("/file")
	public String File()  throws FileNotFoundException,IOException
	{
		return read();	
	}
	public  String read() throws FileNotFoundException,IOException
	{
		
		java.io.File file =ResourceUtils.getFile("classpath:data.txt");
	
		FileReader fr=new FileReader(file);   
		BufferedReader br=new BufferedReader(fr);   
		StringBuffer sb=new StringBuffer();     
		String line;
		int i=1;
//		ContactService contactService = new ContactService();
		List<Contact> contacts=new ArrayList<>();
		while((line=br.readLine())!=null)  
		{  
//		sb.append(line);       
//		sb.append("\n data line by line");     

			Contact contact= new Contact();
			 String[] contactdetails =line.split(" ");
			 System.out.println(contactdetails.length);
			 System.out.println(contactdetails[0]);
			 System.out.println(contactdetails[1]);
			 System.out.println(contactdetails[2]);
			 System.out.println(contactdetails[3]);
			 System.out.println(contactdetails[4]);
			 System.out.println(contactdetails[5]);
			 System.out.println(contactdetails[6]);
		
			 contact.setId(i++);
			 contact.setName(contactdetails[1]);
			 contact.setAddress(contactdetails[3]);
			 contact.setGender(contactdetails[2]);
			 contact.setCoursesinterested(contactdetails[4]);
			 contact.setInterestedinIT(contactdetails[5]);
			 contact.setPercentage(Long.parseLong(contactdetails[6]));
			
			
			 System.out.println("Contact :"+contact);
			 contacts.add(contact)
;		
		     
			
			
		} 
		System.out.println(contacts);
           for(Contact contact:contacts) {
        	   
		 
			contactService.saveOrUpdate(contact);
		
           }
		fr.close();     
		System.out.println("Contents of File: ");  
//		System.out.println(sb.toString());    
		 

//		String content =new String(Files.readAllBytes(((java.io.File) file).toPath()));
//		System.out.println(content);
		return  "redirect:/list";
	}
}

	 
