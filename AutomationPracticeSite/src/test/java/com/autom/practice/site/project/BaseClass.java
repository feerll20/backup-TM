package com.autom.practice.site.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
private WebDriver driver;
private WebDriverWait wait;
	
	public BaseClass(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "/Users/fernandolopez/eclipse-workspace/AutomationPracticeSite/src/main/resources/driver/chromedriver");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
		
	}
	public WebElement findElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void goToURL(String siteURL) {
		driver.get(siteURL);
	}
	
	public void click(By locator) {
		driver.findElement(locator).click();
	}
	
	public void writeText(String text, By locator) {
		driver.findElement(locator).sendKeys(text);
	}
	
	public Boolean isDisplayed(By locator) {
		try{
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		return driver.findElement(locator).isDisplayed();
		 
		}
		catch (org.openqa.selenium.NoSuchElementException exception){
			return false;
		}
	}
	
	public void waitFor(By locator, int timeToWait) {
		wait = new WebDriverWait(driver, timeToWait);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
	}
	
}
