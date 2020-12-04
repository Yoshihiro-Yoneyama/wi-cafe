package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.form.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MapService {
	public String exJSON() {
		User user = new User();
		user.setId("ID1234");
		user.setName("Tanaka");
		user.setAge(30);
		
		ObjectMapper mapper = new ObjectMapper();
		
		try {
			String json = mapper.writeValueAsString(user);
			return json;
		}catch ( JsonProcessingException e ) {
			e.printStackTrace();
			return "";
		}
	}

}
