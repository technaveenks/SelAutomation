package com.sira.learning.SelAutomation.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sira.learning.SelAutomation.pages.HomePage;
import com.sira.learning.SelAutomation.utils.BaseTest;

public class SmokeTest extends BaseTest {
	// WebDriver driver;
	HomePage homePage;

	@BeforeClass
	public void setDriver() {
		homePage = new HomePage(getDriver());
	}

	@Test(priority = 1)
	public void verify_search_of_tshirt() {
		homePage.clearSearchText();
		homePage.enterSearchText("iphone");
		homePage.clickOnSearch();
		// String name = driver.findElement(By.partialLinkText("Faded Short Sleeve
		// T-shirts")).getText();
		// String name = driver.findElement(By.xpath("//h5/a[contains(@title,'Faded
		// Short Sleeve')]")).getText();
		// System.out.println(name);

	}

	@Test(priority = 2)
	public void verify_search_of_summer_dress() {
		homePage.clearSearchText();
		homePage.enterSearchText("MacBook");
		homePage.clickOnSearch();
		  
		
		/*
		 * // String name = driver.findElement(By.partialLinkText("Faded Short Sleeve //
		 * T-shirts")).getText(); String name = driver.findElement(By.xpath(
		 * "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText();
		 * System.out.println(name);
		 */
		 
	}

}
