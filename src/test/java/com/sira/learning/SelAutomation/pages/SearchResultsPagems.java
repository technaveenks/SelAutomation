package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeTest;

public class SearchResultsPagems extends BasePagems {

	
	public SearchResultsPagems(WebDriver driver) {
		super(driver);

	}
	
	@FindBy(xpath= "//*[@id='content']/div[3]/div/div/div[2]/div[1]/p[1]")
	private WebElement _productDescription;
	
	@FindBy(xpath="//*[contains(@class,'button-group')]")
	private WebElement _addToCart;
	
	//@FindBy(xpath="//*[contains(@class, 'alert alert-success alert-dismissible')]")
	@FindBy(xpath = "//*[@id='product-search']/div[1]")
	private WebElement _addToCartAcknowledgement;
	
	@FindBy(xpath = "//*[@id='cart']/button")
	private WebElement _cartItems;
	
	@FindBy(xpath = "//*[@id='cart']/ul/li[2]/div/p/a[1]")
	private WebElement _viewCart;
	
	public String getProductDescription() {
		String description = _productDescription.getText();
		return description;
	}
	
	public void clickOnAddtoCart() {
		_addToCart.click();
			}
	public String getAcknowledgementText() throws InterruptedException {
		Thread.sleep(5000);
		return _addToCartAcknowledgement.getText();
	}
	
	public void clickOnItems() {
		_cartItems.click();
	}
	
	public ViewCartPagems clickOnViewCart() {
		_viewCart.click();
		return new ViewCartPagems(getDriver());
	}
	

}
