package com.sira.learning.SelAutomation.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeTestms {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sravanthi.mallela9\\OneDrive\\Documents\\GitHub\\SelAutomation\\lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationpractice.com/");
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("search_query_top")).sendKeys("T shirts");
		driver.findElement(By.name("submit_search")).click();

		/*
		 * Finding text using partialLinkText String productDescription =
		 * driver.findElement(By.partialLinkText("Faded Short Sleeve T-shirts")).getText
		 * (); System.out.println(productDescription);
		 */

		// Finding text using xpath
		String name = driver.findElement(By.xpath("//h5/a[contains(@title,'Faded Short Sleeve T-shirts')]")).getText();
		System.out.println(name);

		String text = driver.findElement(By.partialLinkText("Printed Summer Dress")).getText();
		System.out.println(text);

		driver.close();
		driver.quit();

	}

}
