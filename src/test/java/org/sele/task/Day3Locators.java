package org.sele.task;

import org.base.function.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3Locators extends BaseClass{
	@BeforeMethod(enabled=false)
	private void beforeMethod() {
		browserLaunch("chrome");
        implicitlyWait(10);
	}
	
	@Test(enabled=false)
	private void amazon() {
		urlLaunch("https://www.amazon.in/");
		WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
        sendKeys(searchBox, "iphone");
        WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
        click(search);        
	}
	@Test(enabled=false)
	private void automatioTesting() {
		urlLaunch("http://demo.automationtesting.in/Register.html");        
	}
	
	@Test(enabled=false) // failed
	private void redbus() throws InterruptedException {
		urlLaunch("https://www.redbus.in/");
		WebElement signbtn = driver.findElement(By.xpath("//div[@id='sign-in-icon-down']"));
		click(signbtn);
		WebElement signin = driver.findElement(By.xpath("//li[@id='signInLink']"));
		jsClick(signin);
//        driver.switchTo().frame(0);
     	Thread.sleep(5000);
		WebElement num = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		sendKeys(num, "6409238096");
//		click(signin);
		
	}
	
	@Test
	private void myntra() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("diable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		
		WebElement mobno = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		mobno.sendKeys("9345678907");
		WebElement conti = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		conti.click();
//		Alert alert = driver.switchTo().alert();
//		alert.dismiss();
		
		
		
		
		
		
       
        
        
	}
}

