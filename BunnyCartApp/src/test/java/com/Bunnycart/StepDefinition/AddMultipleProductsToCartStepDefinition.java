package com.Bunnycart.StepDefinition;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Pages.AddMultipleProductsToCartPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class AddMultipleProductsToCartStepDefinition {
	
	@Given("User opens to the Browser")
	public void user_open_the_browser() throws Exception {
		Browser.init("AddMultipleProductsToCartPage_Report"); 
	   Browser.openBrowser("chrome");
	}
//
//	@And("User navigates to the {string} webpage")
//	public void user_navigate_to_the_webpage(String string) throws Exception {
//	    Browser.navigateToUrl(string);
//	}
	
	@And("User clicks on signin")
	public void user_clicks_on_sign_in() {
		AddMultipleProductsToCartPage.clickOnSignInLink();
	}

	@And("User enters valid {string} email")
	public void user_enters_valid_email(String string) {
		AddMultipleProductsToCartPage.enterEmail(string);
	}

	@And("User enters valid {string} password")
	public void user_enters_valid_password(String string) {
		AddMultipleProductsToCartPage.enterPassword(string);
	}

	@And("User click on signin button")
	public void user_click_on_sign_in_button() {
		AddMultipleProductsToCartPage.clickSignIn();
	}

	@When("User Search for product1 {string} in search textbox")
	public void user_search_for_product1_in_search_textbox(String string) {
		AddMultipleProductsToCartPage.enterSearchData(string);
	}

	@When("User select product1 from the search results")
	public void user_select_product1_from_the_search_results() {
		AddMultipleProductsToCartPage.selectItemInSearch();
	}

	@When("User click on Add to cart for product1")
	public void user_click_on_add_to_cart_for_product1() {
		AddMultipleProductsToCartPage.addSelectedItemToCart();
	}
	
	@When("User Search for product2 {string} in search textbox")
	public void user_search_for_product2_in_search_textbox(String string) {
		AddMultipleProductsToCartPage.enterSearchData(string);
	}
	
	@When("User select product2 from the search results")
	public void user_select_product2_from_the_search_results() {
		AddMultipleProductsToCartPage.selectItemInSearch();
	}

	@When("User selects type of the product2")
	public void user_selects_type_of_the_product2() {
		AddMultipleProductsToCartPage.selectType();
	}

	@When("User click on Add to cart for product2")
	public void user_click_on_add_to_cart_for_product2() {
		AddMultipleProductsToCartPage.addSelectedItemToCart();
	}

	@When("User closes the Browser")
	public void user_closes_the_browser() throws Exception {
		Thread.sleep(3000);
	     Browser.closeBrowser();
	}

}
