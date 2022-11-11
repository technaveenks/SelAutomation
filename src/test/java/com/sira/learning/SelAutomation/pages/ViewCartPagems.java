package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ViewCartPagems extends BasePagems{

	public ViewCartPagems(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr/td[2]/a")
	private WebElement _productNameInCart;
	
	//@FindBy(xpath = "//*[@id='content']/form/div/table/tbody/tr/td[2]/a")
	
	public String getProductNameInCart() {
		String productName = _productNameInCart.getText();
		return productName ;
	}
	
	

}
