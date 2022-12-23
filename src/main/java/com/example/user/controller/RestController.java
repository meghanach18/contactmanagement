package com.example.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.user.model.Contact;
import com.example.user.model.Rest;
import com.example.user.service.RestService;


public class RestController {
	@Autowired
	 RestService restService;
	@RequestMapping(value = "/HII", method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("rest") Rest rest) {
		
	System.out.println(rest);

	restService.saveRest(rest);
	return "HII";
	}

}
