package com.ww.assessment.jyostna.com.questions;

import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.FASSeachResult1LandingPage;
import pageObjects.FindAStudio;
import pageObjects.FindAStudioSearchResults;
import pageObjects.MegaNav;
import pageObjects.OperatingHrs;
import pageObjects.wwNewsletterPopUp;

public class WebDriverTests {

	public WebDriver driver;
	
	@Test(priority=1)
	public void verifyLandingPageTitle() throws IOException
	{		
		// #1 Navigate to https://www.weightwatchers.com/us/
	    // #2 Verify loaded page title matches “WW (Weight Watchers): Weight Loss & Wellness Help”

		driver = Initialize.initializeDriver();
	
		String actualLandingPageTitle = driver.getTitle();
		String expectedLandingPageTitle = "WW (Weight Watchers): Weight Loss & Wellness Help";
		
		Assert.assertEquals(actualLandingPageTitle, expectedLandingPageTitle);
			
	}
	
	
	@Test(priority=2)
	public void verifyFindAStudioPageTitle() throws IOException
	{
		//# 3 - Click the Find a Studio link  
		//# 4 - Verify loaded page title contains “Find WW Studios & Meetings Near You | WW USA”
		
		MegaNav obj = new MegaNav(driver);

		obj.getfindAStudioLink().click();
			
		wwNewsletterPopUp w = new wwNewsletterPopUp(driver);
		int popUpCount= w.getwwNewsletterPopUp().size();
		
		if(popUpCount > 1)
		{
			ClosePopup.closeWWpopUp(driver);
		}
		
		String actualFindAStudioTitle = driver.getTitle();
		String expectedFindAStudioTitle = "Find WW Studios & Meetings Near You | WW USA";
						
		Assert.assertEquals(actualFindAStudioTitle, expectedFindAStudioTitle);
	
	}
	
	@Test(priority=3)
	public void verifyFindAStudioSearchResult1()
	{
		// #5 In the search field, search for meetings for zip code: 10011
		// #6 Print the title of the first result and the distance (located on the right of location title/name)
		// #7 Click on the first search result and verify displayed location name/title matches with the name of the first searched result that was clicked
		
		String zipcode = "10011";
		FindAStudio findStudioObj = new FindAStudio(driver);
		findStudioObj.getSearchBox().sendKeys(zipcode);
		findStudioObj.getSearchButton().click();
		
		FindAStudioSearchResults findStudioSearchResulstObj = new FindAStudioSearchResults(driver);
		String location1LinkText = findStudioSearchResulstObj.getLocationNames().get(0).getText();
		System.out.println(location1LinkText);
		
		String location1DistanceText = findStudioSearchResulstObj.getLocationDistances().get(0).getText();
		System.out.println(location1DistanceText);

		//Click the first link from the search results
		findStudioSearchResulstObj.getLocationNames().get(0).click();
		
		FASSeachResult1LandingPage  fasSeachResut1Obj = new FASSeachResult1LandingPage(driver);
		String searchResult1Text = fasSeachResut1Obj.getSearchResult1Text().getText();
		System.out.println(searchResult1Text);
		
		Assert.assertEquals(location1LinkText, searchResult1Text);
	}
	
	@Test(priority=4)
	public void PrintTodaysHrsOfOperation()
	{
		// # 8 From this location page, print TODAY’s hours of operation (located towards the bottom of the page)
		
		LocalDateTime currentTime = LocalDateTime.now();
		String systemDay = currentTime.getDayOfWeek().toString();
        System.out.println(systemDay);
		
        OperatingHrs opeatingHrsObj = new OperatingHrs(driver);
        int count = opeatingHrsObj.getWrapper().size();
        
        for(int i=0; i<count; i++)
		{
			WebElement day = opeatingHrsObj.getDays().get(i);
			String dayofWeek = day.getText();
			//System.out.println(dayofWeek);
				
			if(systemDay.contains(dayofWeek))
			{
				WebElement dayOperatingHrs =  opeatingHrsObj.getHours().get(i);
				String dayOperatingHrsText = dayOperatingHrs.getText();
				System.out.println(dayOperatingHrsText);
			}
		}
		
	}
	
	@Test(priority=5)
	public void printMeetings()
	{
		//9 - Create a method to print the number of meeting the each person(under the scheduled time) has a particular day of the week

	    //Call the method here
		
		PrintMeetingsDayWeek.PrintMeetings("Mon", driver);
	}

}
