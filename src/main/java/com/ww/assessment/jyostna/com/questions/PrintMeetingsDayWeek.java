package com.ww.assessment.jyostna.com.questions;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintMeetingsDayWeek {

	WebDriver driver;
	
	public static void PrintMeetings(String dayWeek, WebDriver driver) 
	{
		HashMap<String, Integer> objMap = new HashMap<String, Integer>();

		WebElement schedule = driver.findElement(By.className("schedule-detailed"));
		List<WebElement> scheduleLabels =  schedule.findElements(By.className("schedule-detailed-day-label"));
		int scheduleLabelsCount = scheduleLabels.size();
	
		for(int i= 0; i<scheduleLabelsCount; i++)
		{
			String scheduleLabelText = schedule.findElements(By.className("schedule-detailed-day-label")).get(i).getText();
			
			if (scheduleLabelText.equalsIgnoreCase(dayWeek))
			{
				WebElement columnDriver = driver.findElements(By.className("schedule-detailed-day-meetings")).get(i);
						
				int itemLeaderCount = columnDriver.findElements(By.className("schedule-detailed-day-meetings-item-leader")).size();
				
				int totalCount = 0;
				
				for(int j= 0; j<itemLeaderCount; j++)
				{
					
					String itemLeadersIndiv = columnDriver.findElements(By.className("schedule-detailed-day-meetings-item-leader")).get(j).getText();
					
					List<WebElement> indivSize = driver.findElements(By.xpath("//div[contains(text(),'" + itemLeadersIndiv + "')]"));
				    totalCount = indivSize.size();
					objMap.put(itemLeadersIndiv, totalCount);
					 
				}
			
				for(Entry<String, Integer> mapDisplay : objMap.entrySet())
				{
					   System.out.println(mapDisplay);
				}
			
			
			}
		}
	}
}
