
package com.sira.learing.SV.SelAutomation.test;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.sira.learning.SV.SelAutomation.utils.SR_BaseTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SR_SearchPageTest extends SR_BaseTest{

	com.sira.learning.SV.SelAutomation.pages.SR_SearchPage SR_SearchPage;
	@BeforeClass
	public void setDriver() {
		SR_SearchPage = new SR_SearchPage(getDriver());
		
	}
	@Test(priority=1)
	public void verify_Search_Of_Iphone() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//driver.findElement(By.xpath(".//*[@id='search']/input")).sendKeys("iphone");
		//driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();	
		//driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();
		SR_SearchPage.enterSearchText("iphone");
		SR_SearchPage.clickOnSearchButton();
		SR_SearchPage.clickAddToCartButton();
		
	}

}