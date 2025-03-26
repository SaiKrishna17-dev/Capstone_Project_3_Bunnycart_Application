package com.Bunnycart.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Locators.LogOutPageObjects;
import com.Bunnycart.Locators.SignInPageObjects;
import com.aventstack.extentreports.Status;

public class LogOutPage extends Browser {

	
	public static void clickOnSignInLink() {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Click on SignIn Link");
		    logger1.log(Status.INFO, "Clicking on SignIn Link");
    	try 
    	{
    		
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement signInLink= wait.until(ExpectedConditions.elementToBeClickable(LogOutPageObjects.signInLink));
    		signInLink.click();
    		logger1.log(Status.PASS, "Successfully clicked on SignIn Link");
		} 
    	catch (Exception e)
    	{
    		logger1.log(Status.FAIL, "Failed to click SignIn Link: " + e);
			System.out.println(e.getMessage());
		}
    	extent.flush();
    }
	
	public static void enterEmail(String str) {
		 logger1 = extent.createTest("Enter Email");
		    logger1.log(Status.INFO, "Entering Email ");
		try 
		{
			Thread.sleep(2000);
			LogOutPageObjects.email().sendKeys(str);
			logger1.log(Status.PASS, "Successfully entered Email: " + str);
		}
		catch(Exception e)
		{
			  logger1.log(Status.FAIL, "Failed to enter Email: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void enterPassword(String str) {
		 logger1 = extent.createTest("Enter Password");
		 logger1.log(Status.INFO, "Entering Password");
		try
		{
			LogOutPageObjects.password().sendKeys(str);
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
			LogOutPageObjects.signInButton().click();
			logger1.log(Status.PASS, "Successfully Cliked on SignIn Button");
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to click on SignIn Button: " + e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void clickOnSignOut() {
		logger1 = extent.createTest("Click SignOut Button");
		 logger1.log(Status.INFO, "Clicking on SignOut Button");
		try
		{
			Thread.sleep(4000);
			LogOutPageObjects.signOut().click();
			logger1.log(Status.PASS, "Successfully Cliked on SignOut Button");
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to click on SignOut Button: " + e);
			System.out.println(e.getMessage());
		}
	}
	
	public static void verifyLogOut() {
		logger1 = extent.createTest("Verify Session Ends");
		 logger1.log(Status.INFO, "Verifing Session End");
		try
		{
			Thread.sleep(4000);
			List<WebElement> verifyLogOut = LogOutPageObjects.VerifyLogout();
			
			if(verifyLogOut.size() > 0 && verifyLogOut.get(0).getText().equalsIgnoreCase("SIGN IN"))
			{
				logger1.log(Status.PASS, "Session Ended");
				System.out.println("Session Ended");
			}
			else
			{
				logger1.log(Status.FAIL, "Session Continues");
				System.out.println("Session continues");
			}

		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to Verify Message: " + e);
			System.out.println(e.getMessage());
		}
	}
	
}
