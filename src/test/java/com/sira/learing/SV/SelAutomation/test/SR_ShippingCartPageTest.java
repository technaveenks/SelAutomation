package com.sira.learing.SV.SelAutomation.test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sira.learning.SV.SelAutomation.utils.SR_BaseTest;

public class SR_ShippingCartPageTest extends SR_BaseTest {

	WebDriver driver;

	@BeforeClass
	public void setDriver() {
		this.driver = getDriver();

	}
@Test(priority=2)
	public void verify_Total_Amount() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String amount = driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div/table/tbody/tr[4]/td[2]"))
				.getText();
		System.out.println(amount);
		driver.findElement(By.id("//*[@id=\"accordion\"]/div[2]/div[1]/h4/a")).click();

		Select drpCountry = new Select(driver.findElement(By.id("input-country")));
		drpCountry.selectByVisibleText("United States");

		Select dropState = new Select(driver.findElement(By.id("input-zone")));
		dropState.selectByVisibleText("Maryland");

		Select PostCode = new Select(driver.findElement(By.id("input-postcode")));
		PostCode.deselectByVisibleText("20878");

		driver.findElement(By.id("button-quote")).click();
		
		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();
		System.out.println(alerttext);
		

	}
}
