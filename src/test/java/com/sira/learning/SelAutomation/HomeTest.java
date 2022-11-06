package com.sira.learning.SelAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\navee\\Projects\\SelAutomation\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("search_query_top")).sendKeys("T Shirt");
        driver.findElement(By.name("submit_search")).click();
       // String name = driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).getText();
        String name = driver.findElement(By.xpath("//h5/a[contains(@title,'Faded Short Sleeve')]")).getText();
		System.out.println(name);
		driver.close();
		driver.quit();
		
		
	}

}
