package com.qa.EmailAPI;

import static org.mockito.Mockito.times;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.qa.EmailAPI.service.EmailServiceImpl;


@RunWith(MockitoJUnitRunner.Silent.class)
public class MailServiceTests {
	
	@Rule
	public final ExpectedException exception = ExpectedException.none();

	@InjectMocks
	private EmailServiceImpl service;
	
	@Mock
	private JavaMailSender sender;
	
	private static final String TO_1 = "johnsmith@whatever.com";
	private static final String[] TO_2 = {"johnsmith@whatever.com", "janejones@whatever.com"};
	private static final String SUBJECT = "About your order";
	private static final String MAIL_TEXT = "Please reply";
	
	@Test
	public void sendSingleTest() {
		Mockito.doNothing().when(sender).send(Mockito.any(SimpleMailMessage.class));
		service.sendSingleMessage(TO_1, SUBJECT, MAIL_TEXT);
		Mockito.verify(sender).send(Mockito.any(SimpleMailMessage.class));
	}
	
	@Test
	public void sendMultipleTest() {
		Mockito.doNothing().when(sender).send(Mockito.any(SimpleMailMessage.class));
		service.sendMultipleMessages(TO_2, SUBJECT, MAIL_TEXT);
		Mockito.verify(sender, times(2)).send(Mockito.any(SimpleMailMessage.class));
	}

}
