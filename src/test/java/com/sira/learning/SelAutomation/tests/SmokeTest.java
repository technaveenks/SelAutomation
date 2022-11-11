package com.sira.learning.SelAutomation.tests;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.sira.learning.SelAutomation.pages.HomePage;
import com.sira.learning.SelAutomation.pages.SearchResultsPage;
import com.sira.learning.SelAutomation.pages.TabletsPage;
import com.sira.learning.SelAutomation.pages.ViewCartPage;
import com.sira.learning.SelAutomation.utils.BaseTest;

public class SmokeTest extends BaseTest {
	SoftAssert sAssert = new SoftAssert();
	// WebDriver driver;
	HomePage homePage;
	SearchResultsPage searchResultsPage;
	ViewCartPage viewCartPage;
	TabletsPage tabletPage;

	@BeforeClass
	public void setDriver() {
		homePage = new HomePage(getDriver());
	}

	@Test(priority = 1)
	public void verify_search_of_tshirt() throws InterruptedException {
		homePage.clearSearchText();
		homePage.enterSearchText("iphone");
		searchResultsPage = homePage.clickOnSearch();
		String description = searchResultsPage.getProductDescription();
		System.out.println("The Description is " + description);
		searchResultsPage.clickOnAddtoCart();
		String acknowledgementText = searchResultsPage.getAcknowledgementText();
		System.out.println(acknowledgementText);
		viewCartPage = searchResultsPage.clickOnViewCart();

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

	@Test(priority = 0)
	public void verifyItemOnCart() {
		tabletPage = homePage.clickOnTabletsMenu();
		String itemTitle = tabletPage.getItemTitle();
		System.out.println("Step 1");
		sAssert.assertEquals("Samsung Galaxy Tab 10.0", itemTitle);
		System.out.println("Step 2");
		System.out.println(itemTitle);
		System.out.println(tabletPage.getItemDescription());
		tabletPage.clickOnAddToCart();
		tabletPage.clickOnCart();
		viewCartPage = tabletPage.clickOnViewCartLink();
		System.out.println(viewCartPage.getItemDescription());
		sAssert.assertEquals("Samsung Galaxy Tab 10.1", viewCartPage.getItemDescription());
		sAssert.assertAll();
	}

}
