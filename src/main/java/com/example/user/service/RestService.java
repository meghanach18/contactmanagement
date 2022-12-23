package com.example.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.user.model.Rest;
import com.example.user.repository.RestRepository;
@Service
public class RestService {
@Autowired
RestRepository restRepository;
	public Rest saveRest(Rest rest) {
		// TODO Auto-generated method stub
		 return restRepository.save(rest);
		
	}

}
