package com.qa.EmailAPI.rest;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.qa.EmailAPI.service.EmailService;

@CrossOrigin
@RestController
public class EmailRest {
	
	private EmailService src;
	private RestTemplate rest;

}
