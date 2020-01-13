package com.ww.assessment.jyostna.com.questions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestLanch {
	
	WebDriver driver;
	@Test
	public void testLandingPage() throws IOException
	{
		 driver = Initialize.initializeDriver();
		System.out.println(driver.getTitle());
	}

}
