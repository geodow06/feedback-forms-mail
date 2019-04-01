package com.qa.emailapi.service;

public interface EmailService {
	
	void sendSingleMessage(String to, String subject, String text);
	
	void sendMultipleMessages(String[] to, String subject, String text); 

}
