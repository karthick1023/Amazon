package org.sele.task;

import org.base.function.BaseClass; 
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Day2Locators extends BaseClass {
	@BeforeMethod
	private void beforeClass() {
		browserLaunch("chrome");
		implicitlyWait(10);
	}
	
	@Test(enabled=false)
	private void locators() {
		urlLaunch("https://www.redbus.in/");
		WebElement from = driver.findElement(By.id("src"));
		sendKeys(from, "Chennai");
		WebElement to = driver.findElement(By.id("dest"));
		sendKeys(to, "Banglore");
	}
	
	@Test(enabled=false)
	private void google() {
		urlLaunch("https://www.google.com/");
        WebElement google = driver.findElement(By.name("q"));
        sendKeys(google, "Green Technology");
	}
	@Test(enabled=false)
	private void hdfcbank() {
		urlLaunch("https://infinity.icicibank.com/corp/login.jsp");
	}
	
	@Test(enabled=false)
	private void swiggy() {
		urlLaunch("https://www.swiggy.com/");
		WebElement location = driver.findElement(By.id("location"));
		sendKeys(location, "singaperumalkoil");
	}
	
	@Test(enabled=false)
	private void snapdeal() {
		urlLaunch("https://www.snapdeal.com/login");
		WebElement mobnum = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
   //     sendKeys(mobnum, "9976742275");
        jsSendKeys(mobnum, "1234567");
	}
	
	@Test(enabled=false)
	private void autotest() {
		urlLaunch("http://demo.automationtesting.in/Register.html");
        WebElement fname = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
        sendKeys(fname, "karthi");
        WebElement lname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
        sendKeys(lname, "C");
        WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
        sendKeys(address, "Chennai");
	}
	
	@Test(enabled=true)
	private void instagram() {
		urlLaunch("https://www.instagram.com/accounts/login/?hl=en) login page");
		WebElement userName = driver.findElement(By.xpath("//input[contains(@aria-label,'Phone')]"));
//		jsSendKeys(userName, "karthi");
		sendKeys(userName, "karthick");
		WebElement pass = driver.findElement(By.xpath("//input[contains(@aria-label,'Password')]"));
//		jsSendKeys(pass, "12345746");
        sendKeys(pass, "123456789");
	}
	
	

}
