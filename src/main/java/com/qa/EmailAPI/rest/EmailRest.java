package com.qa.EmailAPI.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.EmailAPI.persistence.domain.Email;
import com.qa.EmailAPI.service.EmailService;

@CrossOrigin
@RestController
public class EmailRest {
	
	@Autowired
	private EmailService src;
	
	@PostMapping("/send")
	public void sendSimpleMessage(@RequestBody Email email) {
		src.sendSimpleMessage(email.getTo(), email.getSubject(), email.getText());
	}

}
