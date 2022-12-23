//package com.example.user.excelRest;
//
//import java.io.ByteArrayInputStream;
//import java.io.IOException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.InputStreamResource;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import com.example.user.excel.ExcelGenerator;
//import com.example.user.model.Contact;
//import com.example.user.repository.ContactRepository;
//
//public class ContactExcelRest {
//	@Autowired
//	private ContactRepository contactRepository;
//
//	public ContactExcelRest(ContactRepository contactRepository) {
//		this.contactRepository = contactRepository;
//	}
//	
//	@GetMapping("download/contact.xlsx")
//	public ResponseEntity<InputStreamResource> excelStudentReport() throws IOException
//	{
//		List<Contact> list = (List<Contact>)contactRepository.findAll();
//		
//		ByteArrayInputStream in = ExcelGenerator.contactToExcel(list);
//		
//		org.springframework.http.HttpHeaders headers = new org.springframework.http.HttpHeaders();
//		headers.add("Content-Disposition", "attachment; filename=contact.xlsx");
//		return ResponseEntity
//				.ok()
//				.headers(headers)
//				.body(new InputStreamResource(in));
//	}
//}
