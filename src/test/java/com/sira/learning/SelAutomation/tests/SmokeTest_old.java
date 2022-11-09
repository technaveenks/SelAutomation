package com.sira.learning.SelAutomation.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.sira.learning.SelAutomation.pages.HomePage;
import com.sira.learning.SelAutomation.utils.BaseTest;

public class SmokeTest_old extends BaseTest {
	// WebDriver driver;
	HomePage homePage;

	@BeforeClass
	public void setDriver() {
		homePage = new HomePage(getDriver());
		// this.driver = getDriver();
	}

	@Test(priority = 1)
	public void verify_search_of_tshirt() {
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// driver.findElement(By.id("search_query_top")).clear();
		homePage.clearSearchText();

		// driver.findElement(By.id("search_query_top")).sendKeys("T Shirt");
		homePage.enterSearchText("iphone");

		// driver.findElement(By.name("submit_search")).click();
		homePage.clickOnSearch();
		// String name = driver.findElement(By.partialLinkText("Faded Short Sleeve
		// T-shirts")).getText();
		// String name = driver.findElement(By.xpath("//h5/a[contains(@title,'Faded
		// Short Sleeve')]")).getText();
		// System.out.println(name);

	}

	@Test(priority = 2)
	public void verify_search_of_summer_dress() {
		/*
		 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 * driver.findElement(By.id("search_query_top")).clear();
		 * driver.findElement(By.id("search_query_top")).sendKeys("Summer Dresses");
		 * driver.findElement(By.name("submit_search")).click(); // String name =
		 * driver.findElement(By.partialLinkText("Faded Short Sleeve //
		 * T-shirts")).getText(); String name = driver.findElement(By.xpath(
		 * "//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/h5/a")).getText();
		 * System.out.println(name);
		 */
	}

}
