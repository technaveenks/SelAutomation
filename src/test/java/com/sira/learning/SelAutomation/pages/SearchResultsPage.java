package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchResultsPage extends BasePage{

	public SearchResultsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='content']/div[3]/div/div/div[2]/div[1]/p[1]")
	private WebElement _productDescription;
	
	@FindBy(xpath="//*[@id='content']/div[3]/div/div/div[2]/div[2]/button[1]")
	private WebElement _addToCart;
	
	@FindBy(xpath="//*[@id='product-search']/div[1]")
	private WebElement _addToCartAcknowledgement;
	
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
	
	
	public ViewCartPage clickOnViewCart()  {
	//action to navigate to view cart page
		return new ViewCartPage(getDriver());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
