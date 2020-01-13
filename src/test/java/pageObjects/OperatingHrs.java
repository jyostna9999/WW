package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OperatingHrs {

		WebDriver driver;
			
		By wrapper = By.className("hours-list-item-wrapper");
		
		By days = By.className("hours-list-item-day");
				
		By hours = By.className("hours-list-item-hours");
		
		
		public OperatingHrs(WebDriver driver) {

			this.driver = driver;
		}

		public List<WebElement> getWrapper()
		{
			return driver.findElements(wrapper);
			
		}
		
		public List<WebElement> getDays()
		{
			return driver.findElements(days);
			
		}
		
		public List<WebElement> getHours()
		{
			return driver.findElements(hours);
			
		}

		
	}
	

