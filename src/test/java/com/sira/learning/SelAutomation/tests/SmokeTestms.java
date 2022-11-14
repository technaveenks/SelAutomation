package com.sira.learning.SelAutomation.tests;
import java.time.Duration;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sira.learning.SelAutomation.pages.HomePagems;
import com.sira.learning.SelAutomation.pages.SearchResultsPagems;
import com.sira.learning.SelAutomation.pages.TabletsPagems;
import com.sira.learning.SelAutomation.pages.ViewCartPagems;
import com.sira.learning.SelAutomation.utils.BaseTestms;

import dev.failsafe.internal.util.Assert;

public class SmokeTestms extends BaseTestms {
	SoftAssert sAssert = new SoftAssert();
	//WebDriver driver;
	HomePagems homePagems;
	SearchResultsPagems searchResultsPagems;
	ViewCartPagems viewCartPagems;
	TabletsPagems tabletsPagems;
	@BeforeTest
	@BeforeClass
	public void setDriver(){
		homePagems = new HomePagems(getDriver());
	}
	
	@DataProvider(name = "items")
	public static Object[][] items() {
		return new Object[][] {{"Nikon"},{"iphone"},{"Macbook"},{"Samsung SyncMaster 941BW"}};
		
	}
	//Nikon Samsung SyncMaster 941BW iphone macbook
	@Test(priority=1 , dataProvider = "items")
	public  void verify_search_results1(String items) throws InterruptedException {
		
		homePagems.clearSearchText();
		homePagems.enterSearchText(items);
		searchResultsPagems = homePagems.clickOnSearch();
		String description = searchResultsPagems.getProductDescription();
		System.out.println("The Description is : " +description);
		searchResultsPagems.clickOnAddtoCart();
		String acknowledgementText = searchResultsPagems.getAcknowledgementText();
		System.out.println(acknowledgementText);
		searchResultsPagems.clickOnItems();
		viewCartPagems = searchResultsPagems.clickOnViewCart();
		String productname = viewCartPagems.getProductNameInCart();
		System.out.println("The first product in cart is: " +productname);
		
			}
	
	@Test(priority=2)
	public void adding_cart() {
		homePagems.clearSearchText();
		homePagems.enterSearchText("nikon");
		homePagems.clickOnSearch();
			}
	@Test(priority=0)
	public void verifyItemOnCart() throws InterruptedException {
		 
		tabletsPagems = homePagems.clickOnTabletsMenu();
		String tabletDescription = tabletsPagems.getTabletItemDescription();
		System.out.println("Tablet Description is : " + tabletDescription);
		tabletsPagems.clickOnAddToCart();
		tabletsPagems.clickOnItemsTab();
		//System.out.println("Clicked on items tab");
		viewCartPagems = tabletsPagems.clickOnViewCartLink();
		String tabletdescriptionincart = viewCartPagems.getProductNameInCart();
		System.out.println("The Second product in cart is " +tabletdescriptionincart);
		sAssert.assertEquals("Samsung Galaxy Tab 10.1" , viewCartPagems.getProductNameInCart() );
		sAssert.assertAll();
		
			}
	
	
	}

