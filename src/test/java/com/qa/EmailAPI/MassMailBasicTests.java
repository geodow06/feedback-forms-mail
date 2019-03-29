package com.qa.EmailAPI;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.EmailAPI.persistence.domain.MassMail;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MassMailBasicTests {
	private MassMail email = new MassMail();
	
	@Test
	public void toTest() {
		String[] people = {"johnsmith@whatever.com", "janejones@whatever.com"};
		email.setTo(people);
		assertTrue(email.getTo().equals(people));
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
