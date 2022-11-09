package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.By;
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

	// Actions on the element
	public void clearSearchText() {
		_searchTextBox.clear();
	}

	public void enterSearchText(String searchValue) {
		_searchTextBox.sendKeys(searchValue);
	}

	public void clickOnSearch() {
		_searchButton.click();
	}

}
