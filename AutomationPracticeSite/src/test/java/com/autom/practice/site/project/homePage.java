package com.autom.practice.site.project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage extends BaseClass {
	
	WebDriver driver;
	By searchBox = By.id("search_query_top");
	By searchBtn = By.name("submit_search");
	private WebElement search= driver.findElement(By.xpath("//*[@id='center_column']/h1/span[1]"));
	String searchedText = search.getText();
	WebDriverWait wait;
	
	public homePage(WebDriver driver) {
		super(driver);
		wait = new WebDriverWait(driver, 10);
	}
	
	public boolean runASearch(String searchCriteria) {
		click(searchBox);
		writeText(searchCriteria, searchBox);
		click(searchBtn);
		wait.until(ExpectedConditions.visibilityOf(search));
		try {
			assertEquals(searchedText, searchCriteria);
			return true;
		} catch (org.openqa.selenium.InvalidArgumentException exception) {
			return false;
		}
	}
	
}
