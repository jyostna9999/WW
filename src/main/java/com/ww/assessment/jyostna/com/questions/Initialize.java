package com.ww.assessment.jyostna.com.questions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Initialize {
	
	public static WebDriver driver;

	public static WebDriver initializeDriver() throws IOException
	{
		// TODO Auto-generated method stub
				
		Properties prop = new Properties();
		
		File file = new File("data.properties");
		String path = file.getAbsolutePath();
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver();           
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
		}
		
		else
		{
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		
		driver.manage().window().maximize();	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String URL = prop.getProperty("URL");
		driver.get(URL);
		
		return driver;
	}
	
}
