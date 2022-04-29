package com.autom.practice.site.Tests;

import org.testng.annotations.Test;

import com.autom.practice.site.project.homePage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

public class SearchSomething {
	WebDriver driver;
	homePage homePage;
	
	@BeforeClass
	public void beforeClass() {
		 homePage = new homePage(driver);
		 driver = homePage.chromeDriverConnection();
		 homePage.goToURL("http://automationpractice.com/");
	}

	@Test
	public void searchingAProduct() {
		homePage.runASearch("dolcegabanna");
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
