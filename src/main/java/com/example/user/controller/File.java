//package com.example.user.controller;
//
//import java.io.BufferedReader;
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.Set;
//import java.util.stream.Collectors;
//
//import javax.annotation.Resource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.util.ResourceUtils;
//import org.springframework.util.StringUtils;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.servlet.ModelAndView;
//
//import com.example.user.model.Contact;
//import com.example.user.repository.ContactRepository;
//import com.example.user.service.ContactService;
//
//
//@RestController
//public class File {
//	@Autowired
//	 ContactService contactService;
//	@Autowired
//	ContactRepository contactRepository;
//	
//	
//	
//
//	
//	
//	@RequestMapping("/file")
//	public String File()  throws FileNotFoundException,IOException
//	{
//		return read();	
//	}
//	public static String read() throws FileNotFoundException,IOException
//	{
//		
//		java.io.File file =ResourceUtils.getFile("classpath:data.txt");
//	
//		FileReader fr=new FileReader(file);   
//		BufferedReader br=new BufferedReader(fr);   
//		StringBuffer sb=new StringBuffer();     
//		String line;
//		int i=0;
//		while((line=br.readLine())!=null)  
//		{  
////		sb.append(line);       
////		sb.append("\n data line by line");     
//			 try {
//			Contact contact= new Contact();
//			 String[] contactdetails =line.split(" ");
//			 System.out.println(contactdetails.length);
//			 System.out.println(contactdetails[0]);
//			 System.out.println(contactdetails[1]);
//			 System.out.println(contactdetails[2]);
//			 System.out.println(contactdetails[3]);
//			 System.out.println(contactdetails[4]);
//			 System.out.println(contactdetails[5]);
//		
//			 contact.setId(i++);
//			 contact.setName(contactdetails[1]);
//			 contact.setAddress(contactdetails[3]);
//			 contact.setGender(contactdetails[2]);
//			 contact.setCoursesinterested(contactdetails[4]);
//			 contact.setInterestedinIT(contactdetails[5]);
//			
//			
//			 System.out.println("Contact :"+contact);
//			 ContactService contactService = new ContactService();
//			
//				contactService.saveContact(contact);
//			
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}  
//		
//		fr.close();     
//		System.out.println("Contents of File: ");  
//		System.out.println(sb.toString());    
//		 
//
////		String content =new String(Files.readAllBytes(((java.io.File) file).toPath()));
////		System.out.println(content);
//		return line;
//	}
//}
//	
//		
//	
//
//
//			
//		
//	
//
//
