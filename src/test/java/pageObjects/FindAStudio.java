package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindAStudio {

	WebDriver driver;
		
	By findAStudioMainText = By.className("meeting-finder__header-headline-title.spice-translated");
	 
	By searchBox = By.id("meetingSearch");
	 
	By searchButton = By.cssSelector("button.btn.spice-translated");
	
	public FindAStudio(WebDriver driver) {

		this.driver = driver;
	}


	public WebElement getfindAStudioLink()
	{
		return driver.findElement(findAStudioMainText);
	}
	
	public WebElement getSearchBox()
	{
		return driver.findElement(searchBox);
	}
	
	public  WebElement getSearchButton()
	{
		return driver.findElement(searchButton);
	}
}
