package com.sira.learning.SelAutomation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SmokeTestActual {
	WebDriver driver;
	//@BeforeTest
	@Test
	public void createDriver(){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sravanthi.mallela9\\OneDrive\\Documents\\GitHub\\SelAutomation\\lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test(priority=1)
	public  void verify_search_results2() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("search")).clear();
		driver.findElement(By.name("search")).sendKeys("canon");
		driver.findElement(By.xpath("//*[contains(@class,'input-group-btn')]/button")).click();
		//driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[7]/a")).click();
		String data = driver.findElement(By.partialLinkText("Canon EOS 5D")).getText();
		System.out.println(data);
		String price = driver.findElement(By.xpath("//*[contains(@class,'price-old')] ")).getText();
		System.out.println("Old Price is: " + price);
		String price1 = driver.findElement(By.xpath("//*[contains(@class,'price-new')] ")).getText();
		System.out.println("New Price is: " + price1);
		//driver.findElement(By.xpath("//*[contains(@class,'button-group')]")).click();
		//driver.findElement(By.xpath("//*[contains(@id,'button-cart')]")).click();

	}
	
	@Test(priority=2)
	public void adding_cart() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("search")).clear();
     	driver.findElement(By.name("search")).sendKeys("nikon");
		driver.findElement(By.xpath("//*[contains(@class,'input-group-btn')]/button")).click();
		driver.findElement(By.xpath("//*[contains(@class,'button-group')]")).click();
		String message = driver.findElement(By.xpath("//*[contains(@class, 'alert alert-success alert-dismissible' )]")).getText();
		System.out.println(message);
		
		//driver.findElement(By.xpath("//*[contains(@class,'btn-group btn-block')]")).click();
		//driver.findElement(By.xpath("//*[contains(@class,'col-sm-3')]/button")).click();
		//driver.findElement(By.xpath("//*[contains(@id,'cart')]/button")).click();

		driver.findElement(By.xpath("//*[contains(@id,'top-links')]/ul/li[4]/a")).click();

	}
	
	//@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
		// driver.findElement(By.name("viewport")).click();

		//driver.findElement(By.className("btn btn-default btn-lg")).click();


	}

