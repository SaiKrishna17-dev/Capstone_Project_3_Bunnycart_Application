package com.Bunnycart.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Bunnycart.Browser.Browser;

public class LogOutPageObjects extends Browser {
	
	public static By signInLink =By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
    public static By email=By.xpath("//input[@id=\"email-login\"]");
    public static By password=By.xpath("//input[@id=\"pass-login\"]");
    public static By signInButton=By.xpath("//button[@id=\"send2-login\"]");
    public static By textMessage=By.xpath("//div[@class=\"message message-error error\"]//div");
    public static By signOut=By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
    
    public static WebElement signInLink() {
		return driver.findElement(signInLink);
	}
    
    public static WebElement signOut() {
		return driver.findElement(signOut);
	}
    
    public static WebElement email() {
		return driver.findElement(email);
	}
    
    public static WebElement password() {
		return driver.findElement(password);
	}
    
    public static WebElement signInButton() {
		return driver.findElement(signInButton);
	}
    
    public static List<WebElement> VerifyLogout() {
		return driver.findElements(signInLink);
	}

}
