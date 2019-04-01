package com.qa.emailapi;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.emailapi.persistence.domain.Email;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmailBasicTests {
	private Email email = new Email();
	
	@Test
	public void toTest() {
		email.setTo("johnsmith@whatever.com");
		assertTrue(email.getTo().contentEquals("johnsmith@whatever.com"));
	}
	
	@Test
	public void subjectTest() {
		email.setSubject("About your order");
		assertTrue(email.getSubject().contentEquals("About your order"));
	}
	
	@Test
	public void textTest() {
		email.setText("Please reply");
		assertTrue(email.getText().contentEquals("Please reply"));
	}

}
