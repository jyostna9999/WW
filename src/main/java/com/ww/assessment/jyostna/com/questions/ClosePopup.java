package com.ww.assessment.jyostna.com.questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ClosePopup {

	public static WebDriver driver;
	
	public static void closeWWpopUp(WebDriver driver)
	{
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
	   // WebElement noThanksLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'No Thanks')]")));
	    WebElement noThanksLink = driver.findElement(By.xpath("//button[contains(text(),'No Thanks')]"));

	    noThanksLink.click();


	}
	
}
