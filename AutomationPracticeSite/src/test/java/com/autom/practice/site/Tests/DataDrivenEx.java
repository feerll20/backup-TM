package com.autom.practice.site.Tests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.sql.Driver;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.autom.practice.site.project.loginPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class DataDrivenEx {
	
	WebDriver driver;
	loginPage loginpage;
//	WebDriverWait wait;

	@BeforeClass
	public void beforeClass() {
//		wait = new WebDriverWait(driver, 10);
		loginpage = new loginPage(driver);
		driver = loginpage.chromeDriverConnection();
		loginpage.goToURL("http://automationpractice.com/index.php");
	}

	@Test(dataProvider = "authenticationData")
	public void loginTestDataProvider(String email, String password) {
		loginpage.failedLogIn(email, password);
//		wait.until(ExpectedConditions.visibilityOfElementLocated(emailFieldBy));
//		System.out.println("Si jaloooooo a webo!!");
		AssertJUnit.assertEquals(false, loginpage.isLoggedIn());
		
	}
	
	@DataProvider(name = "authenticationData")
	public Object[][] getAuthData() {
		
		Object[][] data = new Object[2][2];
		data[0][0] = "test1@qa.com"; data[0][1] = "pass.word1";
		data[1][0] = "test2@qa.com"; data[1][1] = "pass.word2";

		return data;
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
