package com.Bunnycart.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Bunnycart.Browser.Browser;
import com.Bunnycart.Locators.CreateAccountPageObjects;
import com.aventstack.extentreports.Status;


public class CreateAccountPage extends Browser {
	
//	static {
//        init("CreateAccountPage_Report"); 
//    } 

	public static void clickCreatAccount() {
		
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Click Create Account Button");
		    logger1.log(Status.INFO, "Attempting to click Create Account button");
		    
    	try
    	{
    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    		WebElement createAccountBtn= wait.until(ExpectedConditions.elementToBeClickable(CreateAccountPageObjects.creat));
    		createAccountBtn.click();
    		 logger1.log(Status.PASS, "Successfully clicked Create Account button");
	    }
    	catch (Exception e)
    	{
			logger1.log(Status.FAIL, "Failed to click Create Account button: " + e);
			System.out.println(e.getMessage());
		}
    	extent.flush();
    }
	
	public static void enterFirstName(String data) {
		 logger1 = extent.createTest("Enter First Name");
		 logger1.log(Status.INFO, "Entering First Name ");
	    	try
	    	{
	    		Thread.sleep(2000);
	    		 logger1.log(Status.PASS, "Successfully entered First Name: " + data);
	    		CreateAccountPageObjects.firstName().sendKeys(data);
			} 
	    	catch (Exception e) 
	    	{
			    logger1.log(Status.FAIL, "Failed to enter First Name: " + e);
	          	System.out.println(e.getMessage());
			}
	    	 extent.flush();
	          }
	
	public static void enterLastName(String data) {
		 logger1 = extent.createTest("Enter Last Name");
		    logger1.log(Status.INFO, "Entering Last Name: ");
    	try 
    	{
    		CreateAccountPageObjects.lastName().sendKeys(data);
    		 logger1.log(Status.PASS, "Successfully entered Last Name: " + data);
		}
    	catch (Exception e)
    	{
			 logger1.log(Status.FAIL, "Failed to enter Last Name: " + e);
          	System.out.println(e.getMessage());
		}
          }
	
	public static void enterEmail(String data) {
		 logger1 = extent.createTest("Enter Email");
		    logger1.log(Status.INFO, "Entering Email ");
    	try
    	{
    		CreateAccountPageObjects.email().sendKeys(data);
    		 logger1.log(Status.PASS, "Successfully entered Email: " + data);
		} 
    	catch (Exception e) 
    	{
    		  logger1.log(Status.FAIL, "Failed to enter Email: " + e);
          	System.out.println(e.getMessage());
		}
    	 extent.flush();
          }
	
	public static void enterPassword(String data) {
		 logger1 = extent.createTest("Enter Password");
		 logger1.log(Status.INFO, "Entering Password");
    	try
    	{
    		CreateAccountPageObjects.password().sendKeys(data);
    		logger1.log(Status.PASS, "Successfully entered Password");
		} 
    	catch (Exception e)
    	{
    		 logger1.log(Status.FAIL, "Failed to enter Password: " + e);
          	System.out.println(e.getMessage());
		}
    	extent.flush();
          }
	
	public static void enterConfirmPassword(String data) {
		logger1 = extent.createTest("Enter  Confirm Password");
	    logger1.log(Status.INFO, "Entering  Confirm Password");

    	try
    	{
    		CreateAccountPageObjects.confirmPassword().sendKeys(data);
    		 logger1.log(Status.PASS, "Successfully entered  Confirm Password");
		} 
    	catch (Exception e)
    	{
    		logger1.log(Status.FAIL, "Failed to enter Confirm Password: " + e);
          	System.out.println(e.getMessage());
		}
    	 extent.flush();
          }
	
	public static void enterWhatsAppNumber(String data) {
		logger1 = extent.createTest("Enter Mobile Number");
	    logger1.log(Status.INFO, "Entering Mobile Number ");

    	try 
    	{
    		CreateAccountPageObjects.whatsAppNumber().sendKeys(data);
    		 logger1.log(Status.PASS, "Successfully entered Mobile Number: " + data);
		}
    	catch (Exception e)
    	{
    		  logger1.log(Status.FAIL, "Failed to enter Mobile Number: " + e);
          	System.out.println(e.getMessage());
		}
    	 extent.flush();
          }
	public static void clickCreatAccountButton() {
		 logger1 = extent.createTest("Click Create Account Button");
		 logger1.log(Status.INFO, "Clicking the Create Account Button");

    	try {
    		CreateAccountPageObjects.ceretButton().click();
    	    logger1.log(Status.PASS, "Successfully clicked the Create Account Button");
		} 
    	catch (Exception e) 
    	{
    		  logger1.log(Status.FAIL, "Failed to click Create Account Button: " + e);
          	System.out.println(e.getMessage());
		}
    	 extent.flush();
	}
	
	public static void successmessage() {
		try {
			System.out.println("User Rigistered Successfully");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void failedmessage() {
     try {
	       System.out.println("Failed to Rigister");		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
