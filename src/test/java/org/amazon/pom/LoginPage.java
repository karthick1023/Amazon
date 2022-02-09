package org.amazon.pom;

import org.base.function.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="nav-link-accountList")
	private WebElement accountBtn;
	
	@FindBy(id="ap_email")
	private WebElement email;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(id="signInSubmit")
	private WebElement signinBtn;
	
	@FindBy(xpath="(//div[@class='a-box-inner a-alert-container'])[1]")
	private WebElement passErr;
	
	public WebElement getAccountBtn() {
		return accountBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getPassErr() {
		return passErr;
	}

	public WebElement getSigninBtn() {
		return signinBtn;
	}
	
	

}
