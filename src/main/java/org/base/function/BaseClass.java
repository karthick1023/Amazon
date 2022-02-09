package org.base.function;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver browserLaunch(String browserName) {
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
			
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			break;				

		default:
			System.err.println("Invalid browser name");
		}
		return driver;
	}

	public static void implicitlyWait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	//urlLaunch
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	//getTitle
	public static String getTitle() {
		return driver.getTitle();
	}
	//getCurrentUrl
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	//getPageSource
	public static String getPageSource() {
		return driver.getPageSource();
	}

	//getText
	public static String getText(WebElement element) {
		return element.getText();

	}
	//click
	public static void click(WebElement element) {
		element.click();
	}
	//clear
	public static void clear(WebElement element) {
		element.clear();
	}
	//close
	public static void close() {
		driver.close();
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	//sendkeys
	public static void sendKeys(WebElement element, String data) {
		element.sendKeys(data);
	}
	//getattribute
	public static String getAttribute(WebElement element, String attName) {
		return element.getAttribute(attName);

	}

	// frame Concept 
	public static void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	public static void switchToFrame(String nameorid) {
		driver.switchTo().frame(nameorid);
	}

	public static void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	public static void parentFrame() {
		driver.switchTo().parentFrame();
	}

	public static void defaultContent() {
		driver.switchTo().defaultContent();

	}

	// Navigation
	public static void navigateToForward() {
		driver.navigate().forward();
	}

	public static void navigateToBack() {
		driver.navigate().back();
	}

	//Select
	public static void selectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void selectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void selectByVisibleText(WebElement element, String visibleText) {
		Select s = new Select(element);
		s.selectByVisibleText(visibleText);
	}

	public static void deselectByIndex(WebElement element, int index) {
		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public static void deselectByValue(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);
	}

	public static void deselectByVisibleText(WebElement element, String visibleText) {
		Select s = new Select(element);
		s.deselectByVisibleText(visibleText);
	}

	public static void deselectall(WebElement element) {
		Select s = new Select(element);
		s.deselectAll();
	}

	//JavaScript
	public static void jsClick(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", element);
	}

	public static void jsSendKeys(WebElement element, String data) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','"+data+"')",element);

	}

	//boolean function
	public static boolean isDisplayed(WebElement element) {
		return element.isDisplayed();
	}

	public static boolean isEnabled(WebElement element) {
		return element.isEnabled();
	}

	public static boolean isSelected(WebElement element) {
		return element.isSelected();
	}

	public static void main(String[] args) {

		int[] a = {5,44,2,78,46,007,45};
		System.out.println("before sorting "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("after sorting "+Arrays.toString(a));

		int[] s = new int[5];
		for (int i = 0; i < s.length; i++) {
			s[i] = i;
		}
		String string = Arrays.toString(s);
		System.out.println(string);

		String ss = "aa1,23,45,678";
		if (ss.contains("aa")|| ss.contains(",")) {
			String replace = ss.replace("aa", "").replace(",", "");
			int parse = Integer.parseInt(replace);
			System.out.println(parse);
		}
		
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(20);
		list.add(50);
		list.add(40);
		list.add(20);
		Collections.sort(list);
	    System.out.println("Ascending order: "+list);
		Integer max = Collections.max(list);
		System.out.println("Maximum number: "+max);
		
		
		
	}



}
