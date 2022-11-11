package com.sira.learning.SelAutomation.tests;
import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.sira.learning.SelAutomation.pages.HomePagems;
import com.sira.learning.SelAutomation.pages.SearchResultsPagems;
import com.sira.learning.SelAutomation.pages.ViewCartPagems;
import com.sira.learning.SelAutomation.utils.BaseTestms;

public class SmokeTestms extends BaseTestms {
	//WebDriver driver;
	HomePagems homePagems;
	SearchResultsPagems searchResultsPagems;
	ViewCartPagems viewCartPagems;
	//@BeforeTest
	@BeforeClass
	public void setDriver(){
		homePagems = new HomePagems(getDriver());
	}
	
	@Test
	public  void verify_search_results1() throws InterruptedException {
		
		homePagems.clearSearchText();
		homePagems.enterSearchText("nikon");
		searchResultsPagems = homePagems.clickOnSearch();
		String description = searchResultsPagems.getProductDescription();
		System.out.println("The Description is : " +description);
		searchResultsPagems.clickOnAddtoCart();
		String acknowledgementText = searchResultsPagems.getAcknowledgementText();
		System.out.println(acknowledgementText);
		searchResultsPagems.clickOnItems();
		viewCartPagems = searchResultsPagems.clickOnViewCart();
		String productname = viewCartPagems.getProductNameInCart();
		System.out.println("The Product Name in the cart is: " +productname);
		
		/*
		 * String data =
		 * driver.findElement(By.partialLinkText("Canon EOS 5D")).getText();
		 * System.out.println(data); String price =
		 * driver.findElement(By.xpath("//*[contains(@class,'price-old')] ")).getText();
		 * System.out.println("Old Price is: " + price); String price1 =
		 * driver.findElement(By.xpath("//*[contains(@class,'price-new')] ")).getText();
		 * System.out.println("New Price is: " + price1);
		 */
		//driver.findElement(By.xpath("//*[contains(@class,'button-group')]")).click();
		//driver.findElement(By.xpath("//*[contains(@id,'button-cart')]")).click();

	}
	
	@Test(priority=2)
	public void adding_cart() {
		homePagems.clearSearchText();
		homePagems.enterSearchText("nikon");
		homePagems.clickOnSearch();
		//driver.findElement(By.xpath("//*[contains(@class,'input-group-btn')]/button")).click();  //clicks on search button
		//driver.findElement(By.xpath("//*[contains(@class,'button-group')]")).click(); //  clicks on add to cart
		//driver.findElement(By.xpath("//*[contains(@class,'btn-group btn-block')]")).click(); //clicks on items tab
		//driver.findElement(By.xpath("//*[contains(@class,'col-sm-3')]/button")).click();
		//driver.findElement(By.xpath("//*[contains(@id,'cart')]/button")).click();

		//driver.findElement(By.xpath("//*[contains(@id,'top-links')]/ul/li[4]/a")).click();

	}
	
	}

