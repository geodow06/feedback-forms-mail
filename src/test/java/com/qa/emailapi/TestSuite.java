package com.qa.emailapi;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)

@Suite.SuiteClasses({ FeedbackFormsMailApplicationTests.class, MailServiceTests.class, EmailBasicTests.class, MassMailBasicTests.class })

public class TestSuite {
}