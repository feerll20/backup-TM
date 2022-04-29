package com.autom.practice.site.Tests;

import org.testng.annotations.Test;

import com.autom.practice.site.project.homePage;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertTrue;

import org.apache.bcel.generic.Select;
import org.apache.http.impl.conn.tsccm.WaitingThread;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class SearchSomething {
	WebDriver driver;
	homePage homePage;
	WebElement search;
	String searchedText;
	WebDriverWait wait;
//	By topSellerTitle = By.xpath("//*[@id=\"center_column\"]/h1/span");

	
	@BeforeClass
	public void beforeClass() {
		 homePage = new homePage(driver);
		 driver = homePage.chromeDriverConnection();
//		 wait = new WebDriverWait(driver, 10);
		 homePage.goToURL("http://automationpractice.com/");
	}

	@Test
	public void searchingAProduct() {
		homePage.runASearch("dolceGabanna");
//		wait.until(ExpectedConditions.presenceOfElementLocated(topSellerTitle));
	}
	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
