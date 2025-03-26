package com.Bunnycart.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Browser {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions act;
	
	public static ExtentReports extent;
	public static ExtentTest logger1;
	public static ExtentSparkReporter reporter;

	public static void init(String reportName) {
		extent = new ExtentReports();
		reporter = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//target//ExtentReports//" + reportName + ".html");
	}
	
	public static void openBrowser(String str) throws Exception {
		if (extent == null) { 
	        init("TestReport");
	    }
		extent.attachReporter(reporter);
        logger1 = extent.createTest("Browser Initialization");
		
		logger1.log(Status.INFO, "Opening the Browser");
		
		try {
			String choice =  str; 
			if (choice.equalsIgnoreCase("Chrome"))
			{
				driver = new ChromeDriver();
				logger1.log(Status.PASS, "Chrome Browser opened Successfully");
			}
			else if (choice.equalsIgnoreCase("Edge"))
			{
				driver = new EdgeDriver();
				logger1.log(Status.PASS, "Edge Browser opened Successfully");
			}
			
		}
		catch (Exception e) {
			logger1.log(Status.FAIL, "Failed, Browser did not open");
			System.out.println("Browser - openBrowser");
		}
		extent.flush();
	}
	
	public static void navigateToUrl(String url) throws Exception {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Navigating to URL");
		    logger1.log(Status.INFO, "Navigating to the URL");
	    try {
	        driver.get(url); 
	        driver.manage().window().maximize();
	    	logger1.log(Status.PASS, "Navigated to URL Successfully");
	    } catch (Exception e) {
	        System.out.println("Failed to open URL: " + e.getMessage());
	        logger1.log(Status.FAIL, "Failed to open URL");
	    }
	    extent.flush();
	}
	public static void closeBrowser() {
		 extent.attachReporter(reporter);
		    logger1 = extent.createTest("Closing Browser");
		    logger1.log(Status.INFO, "Closing the Browser");
		    
		try 
		{
			driver.quit();
			logger1.log(Status.PASS, "Browser Closed Successfully");
		} 
		catch (Exception e)
		{
			 logger1.log(Status.FAIL, "Failed to close Browser");
			System.out.println("Browser - closeBrowser");
		}
		extent.flush();
	}
}

