package com.sira.learning.SV.SelAutomation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SR_SearchPage {
	// constructor
	public SR_SearchPage(WebDriver driver) {
		super(driver);
	}

	// driver.findElement(By.xpath(".//*[@id='search']/input")).sendKeys("iphone");
	// driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	// driver.findElement(By.xpath("//*[@id=\"cart\"]/button")).click();

	@FindBy(xpath = ".//*[@id='search']/input")
	private WebElement _searchTextBox;

	@FindBy(xpath = "//button[@type='button' and @class = 'btn btn-default btn-lg']")
	private WebElement _searchButton;

	@FindBy(xpath = "//*[@id=\'content\']/div[3]/div/div/div[2]/div[2]/button[1]/span")
	private WebElement _addToCartButton;

	// Actions on the element

	public void enterSearchText(String value) {

		_searchTextBox.sendKeys(value);
	}

	public void clickOnSearchButton() {
		_searchButton.click();
	}

	public void clickAddToCartButton() {
		_addToCartButton.click();

	}

}