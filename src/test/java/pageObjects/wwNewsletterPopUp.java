package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class wwNewsletterPopUp {
	
	 public WebDriver driver;
	
	  By wwNewsletter = By.xpath("//div[contains(text(),'receive the WW newsletter')]");
	

	public wwNewsletterPopUp(WebDriver driver) {

		this.driver = driver;
	}


	public   List<WebElement>  getwwNewsletterPopUp()
	{
		  return driver.findElements(wwNewsletter);
	}

}
