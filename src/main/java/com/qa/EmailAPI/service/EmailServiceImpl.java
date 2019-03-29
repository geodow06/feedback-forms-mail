package com.qa.EmailAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
	
	@Autowired
    public JavaMailSender emailSender;

    public void sendSingleMessage(String to, String subject, String text) {
        try {
            SimpleMailMessage message = new SimpleMailMessage();
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            emailSender.send(message);
        } catch (MailException exception) {
            exception.printStackTrace();
        }
    }
    
    public void sendMultipleMessages(String[] to, String subject, String text) {
    	try {
    		SimpleMailMessage[] messages = new SimpleMailMessage[to.length];
    		for (int i=0; i<to.length; i++) {
    			SimpleMailMessage m = new SimpleMailMessage();
    			m.setTo(to[i]);
    			m.setSubject(subject);
    			m.setText(text);
    			messages[i] = m;
    		}
    		for (SimpleMailMessage message:messages) {
    			emailSender.send(message);
    		}
        } catch (MailException exception) {
            exception.printStackTrace();
        }
    }

}
