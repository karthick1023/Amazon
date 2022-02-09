package org.sele.task;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day1BrowserLaunch {
	
	public static void main(String[] args) {
		
//		WebDriverManager.iedriver().setup();
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("https://www.facebook.com/");
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver2 = new EdgeDriver();
		driver2.get("https://www.facebook.com/");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver3 = new ChromeDriver();
		driver3.get("https://www.facebook.com/");
		
		
	}

}
