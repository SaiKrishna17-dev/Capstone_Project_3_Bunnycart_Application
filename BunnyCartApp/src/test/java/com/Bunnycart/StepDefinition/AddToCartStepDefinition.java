package com.Bunnycart.StepDefinition;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Pages.AddToCartPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AddToCartStepDefinition {

	@Given("User opens the Browser")
	public void user_opens_the_browser() throws Exception {
		Browser.init("AddToCartPage_Report"); 
		Browser.openBrowser("chrome");
	}

	@Given("User navigates to the {string} webpage")
	public void user_navigates_to_the_webpage(String string) throws Exception {
		Browser.navigateToUrl(string);
	}

	@Then("User clicks on Sign in")
	public void user_clicks_on_sign_in() {
		AddToCartPage.clickOnSignInLink();
	}

	@Then("User enters the {string} as email")
	public void user_enters_the_as_email(String string) {
		AddToCartPage.enterEmail(string);
	}

	@Then("User enters the {string} as password")
	public void user_enters_the_as_password(String string) {
		AddToCartPage.enterPassword(string);
	}

	@Then("User clicks on Sign in button")
	public void user_clicks_on_sign_in_button() {
		AddToCartPage.clickSignIn();
	}

	@Then("User search for a product")
	public void user_search_for_a_product() {
		AddToCartPage.enterSearchData("Aquatic");
	}

	@Then("User selects a product")
	public void user_selects_a_product() {
		AddToCartPage.selectItemInSearch();
	}

	@Then("User adds the product to cart")
	public void user_adds_the_product_to_cart() {
		AddToCartPage.addSelectedItemToCart();
	}
	
	@Then("User close the browser")
	public void user_closes_the_browser() throws Exception {
		Thread.sleep(4000);
		Browser.closeBrowser();
	}
	
}
