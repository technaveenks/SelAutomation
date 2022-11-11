package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	// Constructor
	public HomePage(WebDriver driver) {
		super(driver);
	}

	// Element Identification
	@FindBy(xpath = "//*[@id='search']/input")
	private WebElement _searchTextBox;

	@FindBy(xpath = "//*[@id='search']/span/button")
	private WebElement _searchButton;
	
	@FindBy(xpath="//*[@id='menu']/div[2]/ul/li[4]/a")
	private WebElement _menuTablets;

	// Actions on the element
	public void clearSearchText() {
		_searchTextBox.clear();
	}

	public void enterSearchText(String searchValue) {
		_searchTextBox.sendKeys(searchValue);
	}

	public SearchResultsPage clickOnSearch() {
		_searchButton.click();
		return new SearchResultsPage(getDriver());
	}
	
	public TabletsPage clickOnTabletsMenu() {
		_menuTablets.click();
		return new TabletsPage(getDriver());
	}

}
