package com.qa.emailapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.qa.emailapi.persistence.domain.Email;
import com.qa.emailapi.persistence.domain.MassMail;
import com.qa.emailapi.service.EmailService;

@CrossOrigin
@RestController
public class EmailRest {
	
	@Autowired
	private EmailService src;
	
	@PostMapping("/send")
	public void sendSingleMessage(@RequestBody Email email) {
		src.sendSingleMessage(email.getTo(), email.getSubject(), email.getText());
	}
	
	@PostMapping("/massSend")
	public void sendMultipleMessages(@RequestBody MassMail email) {
		src.sendMultipleMessages(email.getTo(), email.getSubject(), email.getText());
	}

}
