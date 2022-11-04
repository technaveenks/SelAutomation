package com.sira.learning.SelAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Projects\\SelAutomation\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("search_query_top")).sendKeys("Mens Track Suite");
        driver.findElement(By.name("submit_search")).click();
		
	}

}
