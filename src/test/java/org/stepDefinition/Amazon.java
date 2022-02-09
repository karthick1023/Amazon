package org.stepDefinition;

import static org.junit.Assert.assertTrue;

import org.amazon.pom.LoginPage;
import org.base.function.BaseClass;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends BaseClass {
	LoginPage l;

@Given("User should be on amzon home page")
public void user_should_be_on_amzon_home_page() throws InterruptedException {
   browserLaunch("chrome");
   implicitlyWait(10);
   Thread.sleep(3000);
 //  urlLaunch("https://www.amazon.in/");
   quit();
}

//@When("User should navigate to login page and fill email")
//public void user_should_navigate_to_login_page_and_fill_email() {
//	l = new LoginPage();
//    click(l.getAccountBtn());
//    sendKeys(l.getEmail(), "karthick@gmail.com");
//    String attribute = getAttribute(l.getEmail(), "value");  
//    Assert.assertEquals("verify message", "karthick@gmail.com", attribute);
//    }
//
//@When("User click on continue button")
//public void user_click_on_continue_button() {
//    click(l.getContinueBtn());
//}
//
//
//@When("User has to fill password and click login button")
//public void user_has_to_fill_password_and_click_login_button() {
//  sendKeys(l.getPassword(), "oiytrsxcvb98654");
//  String attribute = l.getPassword().getAttribute("value");
//  Assert.assertEquals("verify password", "oiytrsxcvb98654", attribute);
//  click(l.getSigninBtn());
//}	
//
//@Then("User should see the error message")
//public void user_should_see_the_error_message() {
//   assertTrue("verify error message", l.getText(l.getPassErr()).contains("re-enter your password"));
//   quit();
//}

}
