package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FindAStudioSearchResults {

	WebDriver driver;
	
	By findAStudioMainText = By.className("meeting-finder__header-headline-title.spice-translated");
	 
	By locationNames = By.className("location__name");

	By locationDistances = By.className("location__distance");

	public FindAStudioSearchResults(WebDriver driver) {

		this.driver = driver;
	}
	
	public List<WebElement> getLocationNames()
	{
		return driver.findElements(locationNames);
		
	}
	
	public List<WebElement> getLocationDistances()
	{
		return driver.findElements(locationDistances);
		
	}



	
}
