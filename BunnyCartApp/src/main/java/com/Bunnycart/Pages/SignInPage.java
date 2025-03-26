package com.Bunnycart.Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Locators.SignInPageObjects;
import com.Bunnycart.Screenshot.Capture;
import com.aventstack.extentreports.Status;

public class SignInPage extends Browser {
	
	public static void clickOnSignInLink() {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Click on SignIn Link");
		    logger1.log(Status.INFO, "Clicking on SignIn Link");
    	try 
    	{
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement signInLink= wait.until(ExpectedConditions.elementToBeClickable(SignInPageObjects.signInLink));
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
			SignInPageObjects.email().sendKeys(str);
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
			SignInPageObjects.password().sendKeys(str);
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
			SignInPageObjects.signInButton().click();
			logger1.log(Status.PASS, "Successfully Cliked on SignIn Button");
		}
		catch(Exception e)
		{
			 logger1.log(Status.FAIL, "Failed to click on SignIn Button: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}
	
	public static void verifyMessage() {
		 logger1 = extent.createTest("Verify The Message");

		try
		{
			Thread.sleep(2000);
			List<WebElement> failedMessage = SignInPageObjects.verifyMessage();
			
			if(failedMessage.size()>0)
			{
				logger1.log(Status.INFO, "Verifing The Error Message");
				logger1.addScreenCaptureFromPath(Capture.screenShot("Invalid_Login"));
				System.out.println(failedMessage.get(0).getText());
				logger1.log(Status.PASS, failedMessage.get(0).getText());
			}
			else
			{
				logger1.log(Status.INFO, "Verifing The Success Message");
				Thread.sleep(6000);
				List<WebElement> signOut = SignInPageObjects.signOut();
				
				if(signOut.size() > 0 && signOut.get(0).getText().equalsIgnoreCase("SIGN OUT"))
				{
					logger1.log(Status.PASS, "Login Successful");
					logger1.addScreenCaptureFromPath(Capture.screenShot("Valid_Login"));
					System.out.println("Login Successful");
				}
			}
		}
		catch(Exception e)
		{
			logger1.log(Status.FAIL, "Failed to click on SignIn Button: " + e);
			System.out.println(e.getMessage());
		}
		extent.flush();
	}

}
