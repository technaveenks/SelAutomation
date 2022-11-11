package com.sira.learning.SelAutomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTestms {
	private WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	@BeforeTest
	public void createDriver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanthi.mallela9\\OneDrive\\Documents\\GitHub\\SelAutomation\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}

}
