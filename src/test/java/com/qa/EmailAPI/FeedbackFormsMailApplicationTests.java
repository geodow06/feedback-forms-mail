package com.qa.EmailAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.EmailAPI.service.EmailServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FeedbackFormsMailApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void sendsEmail() {
		EmailServiceImpl service = new EmailServiceImpl();
		service.sendSimpleMessage("Jonathan.Eures@academytrainee.com", "Test Email", "This is a test!");
	}

}
