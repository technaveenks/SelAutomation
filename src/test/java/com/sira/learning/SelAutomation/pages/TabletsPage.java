package com.sira.learning.SelAutomation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TabletsPage extends BasePage {

	public TabletsPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath="//*[@id='content']/div[2]/div/div/div[2]/div[1]/h4/a")
	private WebElement _itemTitle;
	
	@FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[2]/div[1]/p[1]")
	private WebElement _tabletItemDescription;

	@FindBy(xpath = "//*[@id='content']/div[2]/div/div/div[2]/div[2]/button[1]/span")
	private WebElement _addToCart;

	@FindBy(xpath = "//*[@id='cart']/button")
	private WebElement _cartButton;

	@FindBy(xpath = "//*[@id='cart']/ul/li[2]/div/p/a[1]")
	private WebElement _clickOnViewCartLink;
	
	public String getItemTitle() {
		return _itemTitle.getText();
	}

	public String getItemDescription() {
		return _tabletItemDescription.getText();
	}

	public void clickOnAddToCart() {
		_addToCart.click();
	}

	public void clickOnCart() {
		WebElement element = new WebDriverWait(getDriver(), Duration.ofSeconds(20))
		        .until(ExpectedConditions.elementToBeClickable(_cartButton));
		element.click();
	}

	public ViewCartPage clickOnViewCartLink() {
		WebElement element = new WebDriverWait(getDriver(), Duration.ofSeconds(20))
		        .until(ExpectedConditions.elementToBeClickable(_clickOnViewCartLink));
		element.click();
		return new ViewCartPage(getDriver());
	}

}
