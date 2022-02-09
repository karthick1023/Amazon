package org.amazon.pom;

import org.base.function.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage extends BaseClass{

	public AmazonPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement searchBox; 
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement searchBtn;
	
	@FindBy(xpath="//span[text()='128 GB']")
	private WebElement ramSize; 
	
	@FindBy(xpath="//span[text()='New Apple iPhone 12 Pro (128GB) - Graphite']")
	private WebElement product;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}
	
	public WebElement getramSize() {
		return ramSize;
	}
	
	public WebElement getProduct() {
		return product;
	}
	
	
	

}
