package pageObjects;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MegaNav {

	WebDriver driver;
		
	 By findAStudioLink = By.id("ela-menu-visitor-desktop-supplementa_find-a-studio");
	
	
	public MegaNav(WebDriver driver) {

		this.driver = driver;
	}


	public  WebElement getfindAStudioLink()
	{
		return driver.findElement(findAStudioLink);
	}
	
}
