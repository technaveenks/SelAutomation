package com.sira.learning.SelAutomation.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ViewCartPage extends BasePage{

	public ViewCartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//*[@id='content']/form/div/table/tbody/tr/td[2]/a")
	private WebElement _itemDescription;
	
	public String getItemDescription() {
		WebElement element = new WebDriverWait(getDriver(), Duration.ofSeconds(20))
		        .until(ExpectedConditions.visibilityOf(_itemDescription));
		return element.getText();
	}

}
