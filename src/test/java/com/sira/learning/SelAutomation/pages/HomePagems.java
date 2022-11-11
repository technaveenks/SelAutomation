package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePagems extends BasePagems {
	// Constructor
	public HomePagems(WebDriver driver) {
		super(driver);
	}

	// Element Identification
	@FindBy(name = "search")
	// @FindBy(xpath = "//*[@id='search']/input")
	private WebElement _searchTextBox;

	@FindBy(xpath = "//*[contains(@class,'input-group-btn')]/button")
	// @FindBy(xpath = "//*[@id='search']/input")
	private WebElement _searchButton;
	
	@FindBy(xpath = "//*[@id='menu']/div[2]/ul/li[4]/a")
	private WebElement _menuTablets;
	
	// Actions on the element

	public void clearSearchText() {
		_searchTextBox.clear();
	}

	public void enterSearchText(String searchValue) {
		_searchTextBox.sendKeys(searchValue);

	}

	public SearchResultsPagems clickOnSearch() {
		_searchButton.click();
		return new SearchResultsPagems(getDriver());
	}

	public TabletsPagems clickOnTabletsMenu() {
		_menuTablets.click();
		return new TabletsPagems(getDriver());
	}
}
