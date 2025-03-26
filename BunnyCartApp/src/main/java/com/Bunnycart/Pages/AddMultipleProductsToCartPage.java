package com.Bunnycart.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Locators.AddMultipleProductsToCartPageObjects;
import com.aventstack.extentreports.Status;

public class AddMultipleProductsToCartPage extends Browser {
	
	public static void clickOnSignInLink() {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Click on SignIn Link");
		    logger1.log(Status.INFO, "Clicking on SignIn Link");
    	try {
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement signInLink= wait.until(ExpectedConditions.elementToBeClickable(AddMultipleProductsToCartPageObjects.signInLink));
    		signInLink.click();
    		 logger1.log(Status.PASS, "Successfully clicked on SignIn Link");
    		
		} catch (Exception e) {
			logger1.log(Status.FAIL, "Failed to click SignIn Link: " + e);
			System.out.println(e.getMessage());
		}
    	extent.flush();
    }
	
	public static void enterEmail(String str) {
		logger1 = extent.createTest("Enter Email");
	    logger1.log(Status.INFO, "Entering Email ");
		try {
			Thread.sleep(2000);
			AddMultipleProductsToCartPageObjects.email().sendKeys(str);
			logger1.log(Status.PASS, "Successfully entered Email: " + str);
			
		} catch(Exception e) {
			 logger1.log(Status.FAIL, "Failed to enter Email: " + e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void enterPassword(String str) {
		logger1 = extent.createTest("Enter Password");
		 logger1.log(Status.INFO, "Entering Password");
		try
		{
			AddMultipleProductsToCartPageObjects.password().sendKeys(str);
			logger1.log(Status.PASS, "Successfully entered Password");
		}
		catch(Exception e)
		{
			 logger1.log(Status.FAIL, "Failed to enter Password: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void clickSignIn() {
		 logger1 = extent.createTest("Click SignIn Button");
		 logger1.log(Status.INFO, "Clicking on SignIn Button");
		try
		{
			AddMultipleProductsToCartPageObjects.signInButton().click();
			logger1.log(Status.PASS, "Successfully Cliked on SignIn Button");
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to click on SignIn Button: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void enterSearchData(String str) {
		logger1 = extent.createTest("Enter Search Data");
		 logger1.log(Status.INFO, "Entering Search Data");
		try
		{
			Thread.sleep(4000);
			AddMultipleProductsToCartPageObjects.search().sendKeys(str);
			logger1.log(Status.PASS, "Entered Search Data Successfully");
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to enter search Data: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void selectItemInSearch() {
		logger1 = extent.createTest("Select Item In Search List");
		 logger1.log(Status.INFO, "Selecting Item In Search List");
		try 
		{
			Thread.sleep(4000);
			List<WebElement> searchList= AddMultipleProductsToCartPageObjects.searchList();
			
			if(searchList.size()>0)
			{
				searchList.get(0).click();
				logger1.log(Status.PASS, "Selected Item Successfully");
			}
			else
			{
				System.out.println("No Search List for entered data");
			}
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to Select Product: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void addSelectedItemToCart() {
		logger1 = extent.createTest("Add Selected product to Cart");
		 logger1.log(Status.INFO, "Adding Selected product to Cart");
		try
		{
			Thread.sleep(6000);
			AddMultipleProductsToCartPageObjects.addToCart().click();
			logger1.log(Status.PASS, "Product Added to Cart Sucessfully");
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to Add product to cart: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void selectType() {
		logger1 = extent.createTest("Select Type of Product");
		 logger1.log(Status.INFO, "Selecting Type of Product");
		try
		{
			Thread.sleep(4000);
			AddMultipleProductsToCartPageObjects.selectType().click();
			logger1.log(Status.PASS, "Product Type Selected Sucessfully");
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to Select the Type of the Product: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}

}
