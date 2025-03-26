package com.Bunnycart.StepDefinition;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Pages.SignInPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SignInStepDefinition {
	
	@Given("User open the Browser")
	public void user_open_the_browser() throws Exception {
		Browser.init("SignInPage_Report"); 
	   Browser.openBrowser("chrome");
	}

	@Given("User navigate to the {string} webpage")
	public void user_navigate_to_the_webpage(String string) throws Exception {
	    Browser.navigateToUrl(string);
	}

	@Given("User click on Sign in")
	public void user_click_on_sign_in() {
		SignInPage.clickOnSignInLink();
	}

	@Then("User enter the {string} as email")
	public void user_enter_the_as_email(String string) {
		SignInPage.enterEmail(string);
	}

	@Then("User enter the {string} as password")
	public void user_enter_the_as_password(String string) {
		SignInPage.enterPassword(string);
	}

	@Then("User click on Sign in button")
	public void user_click_on_sign_in_button() {
		SignInPage.clickSignIn();
	}

	@Then("User verify the message")
	public void user_verify_the_message() {
		SignInPage.verifyMessage();
	}
	
	@Then("User closes browser")
	public void user_closes_the_browser() throws Exception {
		Thread.sleep(4000);
		Browser.closeBrowser();
	}

}
