package com.autom.practice.site.project;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class loginPage extends BaseClass {
	
	By signInBtn = By.linkText("Sign in");
	By signOutBtn = By.linkText("Sign out");
	By failedLoginMsg = By.xpath("//*[@id='center_column']/div[1]/ol/li");
	By emailField = By.id("email");
	By passwordField = By.id("passwd");
	By submitLoginBtn = By.id("SubmitLogin");
	
	public loginPage(WebDriver driver) {
		super(driver);
	}
	
	public void failedLogIn(String email, String password) {
		click(signInBtn);
		writeText(email, emailField);
		writeText(password, passwordField);
		click(submitLoginBtn);
//		if(isDisplayed(failedLoginMsg)){
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	public void successLogin(String email, String password) {
		click(signInBtn);
		writeText(email, emailField);
		writeText(password, passwordField);
		click(submitLoginBtn);
//		if(isDisplayed(signOutBtn)){
//			return true;
//		}
//		else {
//			return false;
//		}
	}
	
	public boolean isLoggedIn() {
		try {
			return isDisplayed(signOutBtn);
		} catch (NoSuchElementException exception) {
			return false;
		}
		
	}
	
	public boolean isNotLoggedIn() {
		try {
			return isDisplayed(failedLoginMsg);
		} catch (NoSuchElementException exception) {
			return true;
		}
	}
}
