package com.sira.learning.SelAutomation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TabletsPagems extends BasePagems {

	public TabletsPagems(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='content']/div[2]/div/div/div[2]/div[1]/h4/a")
	private WebElement _tabletItemDescription;
	
	@FindBy(xpath="//*[contains(@class,'button-group')]")
	private WebElement _addToCart;
	
	@FindBy(xpath="//*[@id='cart']/button")
	private WebElement _clickOnItems;
	
	@FindBy(xpath="//*[@id='cart']/ul/li[2]/div/p/a[1]")
	//*[@id="cart"]/ul/li[2]/div/p/a[1]/strong
	//*[@id="cart"]/ul/li[2]/div/p/a[1]
	private WebElement _viewCartLink;
	
	
	public String getTabletItemDescription() {
		String tabletDescription = _tabletItemDescription.getText();
		return tabletDescription;
	}
	
	public void clickOnAddToCart() {
		_addToCart.click();
	}
	
	public void clickOnItemsTab() {
		_clickOnItems.click();
	}
	
	public ViewCartPagems clickOnViewCartLink() {
		_viewCartLink.click();
		return new ViewCartPagems(getDriver());
	}
	
	
	
	

}
