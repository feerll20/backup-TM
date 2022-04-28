package com.autom.practice.site.Tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.autom.practice.site.project.loginPage;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	loginPage loginPage;

	@BeforeClass
	public void beforeClass() {
		loginPage = new loginPage(driver);
		driver = loginPage.chromeDriverConnection();
		loginPage.goToURL("http://automationpractice.com/index.php");
	}

	@Test
	public void failedLoginTestCase() {
		loginPage.failedLogIn("dasda@œsada.com", "passasa");
		assertFalse(loginPage.isLoggedIn());
	}

	@Test
	public void successLoginTestcase() {
		loginPage.successLogin("feerll20@gmail.com", "pass.word1");
		assertTrue(loginPage.isLoggedIn());
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
