package com.autom.practice.site.project;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.servlet.listener.ELContextCleaner;
import org.openqa.*;
import com.gargoylesoftware.htmlunit.javascript.host.html.HTMLSelectElement;

public class homePage extends BaseClass {

	WebDriver driver;
	By searchBox = By.id("search_query_top");
	By searchBtn = By.name("submit_search");
	By searchResults = By.xpath("//*[@id=\"center_column\"]/h1/span");


	public homePage(WebDriver driver) {
		super(driver);
	}

	public void runASearch(String searchCriteria) {
//		wait = new WebDriverWait(driver, 5);
		click(searchBox);
		writeText(searchCriteria, searchBox);
		click(searchBtn);
		isDisplayed(searchResults);
	}
}
