package com.sira.learning.SV.SelAutomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SR_BaseTest {
	
	WebDriver driver;
	
	public  WebDriver getDriver() {
		return driver;
	
	}
	
	@BeforeTest
	public void createDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}
		
		@AfterTest
		public void tearDown() {
			driver.close();
			
			
		}

		
	}
		
	
		
		
		
		
		
		
		
		
	