package org.stepDefinition;

import org.amazon.pom.LoginPage;
import org.base.function.BaseClass;
import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Amazon extends BaseClass {
	LoginPage l;

	@Given("User should be on amazon home page")
	public void user_should_be_on_amazon_home_page() {
   browserLaunch("chrome");
   implicitlyWait(10);
   urlLaunch("https://www.amazon.in/");
   
}

	@When("User should navigate to login page and fill {string}")
	public void user_should_navigate_to_login_page_and_fill(String string) {
 l = new LoginPage();
    click(l.getAccountBtn());
    sendKeys(l.getEmail(), "karthick@gmail.com");
    String attribute = getAttribute(l.getEmail(), "value");  
    Assert.assertEquals("verify message", "karthick@gmail.com", attribute);
    }

	@When("User click on continue button")
	public void user_click_on_continue_button() {
    click(l.getContinueBtn());
}


	@When("User has to fill {string} and click login button")
	public void user_has_to_fill_and_click_login_button(String pass) {
 sendKeys(l.getPassword(), pass);
  String attribute = l.getPassword().getAttribute("value");
  Assert.assertEquals("verify password", pass, attribute);
  click(l.getSigninBtn());
}	

	@Then("User should see the error message")
	public void user_should_see_the_error_message() {
		
		System.out.println(getText(l.getPassErr()));
		Assert.assertTrue("verify err msg", getText(l.getPassErr()).contains("re-enter your password"));
   quit();
}

}
