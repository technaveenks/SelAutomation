package com.sira.learning.SelAutomation.tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sira.learning.SelAutomation.utils.BaseTest;

public class SearchTest extends BaseTest {
	WebDriver driver;

	@BeforeClass
	public void setDriver() {
		this.driver =getDriver();
	}
	@Test(priority = 3)
	public void verify_search_of_tshirt() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys("T Shirt");
		driver.findElement(By.name("submit_search")).click();
		// String name = driver.findElement(By.partialLinkText("Faded Short Sleeve
		// T-shirts")).getText();
		String name = driver.findElement(By.xpath("//h5/a[contains(@title,'Faded Short Sleeve')]")).getText();
		System.out.println(name);

	}

	@Test(priority = 4)
	public void verify_search_of_summer_dress() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("search_query_top")).clear();
		driver.findElement(By.id("search_query_top")).sendKeys("Summer Dresses");
		driver.findElement(By.name("submit_search")).click();
		// String name = driver.findElement(By.partialLinkText("Faded Short Sleeve
		// T-shirts")).getText();
		String name = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText();
		System.out.println(name);

	}

	

}
