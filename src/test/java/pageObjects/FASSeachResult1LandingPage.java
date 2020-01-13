package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FASSeachResult1LandingPage {

	WebDriver driver;
	
	By searchResult1Text = By.className("location__name");
	 
	

	public FASSeachResult1LandingPage(WebDriver driver) {

		this.driver = driver;
	}
	
	public WebElement getSearchResult1Text()
	{
		return driver.findElement(searchResult1Text);
		
	}
	
	
}
