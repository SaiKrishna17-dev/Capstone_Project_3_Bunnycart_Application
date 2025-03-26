package com.Bunnycart.StepDefinition;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Pages.LogOutPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class LogOutStepDefinition {

	@Given("User opens to Browser")
	public void user_open_the_browser() throws Exception {
		Browser.init("LogOutPage_Report");
	   Browser.openBrowser("chrome");
	}

//	@Given("User navigates to the {string} webpage")
//	public void user_navigate_to_the_webpage(String string) throws Exception {
//	    Browser.navigateToUrl(string);
//	}
//
	@Given("User click on sign in")
	public void user_click_on_sign_in() {
		LogOutPage.clickOnSignInLink();
	}

//	@Then("User enters valid {string} email")
//	public void user_enter_the_as_email(String string) {
//		LogOutPage.enterEmail(string);
//	}
//
//	@Then("User enters valid {string} password")
//	public void user_enter_the_as_password(String string) {
//		LogOutPage.enterPassword(string);
//	}

	@Then("User click on sign in button")
	public void user_click_on_sign_in_button() {
		LogOutPage.clickSignIn();
	}
	
	@Then("User click on signOut button")
	public void user_click_on_signOut_button() {
		LogOutPage.clickOnSignOut();
	}
	

	@Given("User verifies the seession ends")
	public void user_verifies_the_seession_ends() {
	    LogOutPage.verifyLogOut();
	}
	
	@Then("User close browser")
	public void user_closes_the_browser() throws Exception {
		Browser.closeBrowser();
	}

}
