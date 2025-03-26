package com.Bunnycart.Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Bunnycart.Browser.Browser;

public class AddMultipleProductsToCartPageObjects extends Browser{

	public static By signInLink =By.xpath("//*[@id=\"html-body\"]/div[2]/header/div[1]/div/div/div/div/ul/li[5]/a");
    public static By email=By.xpath("//input[@id=\"email-login\"]");
    public static By password=By.xpath("//input[@id=\"pass-login\"]");
    public static By signInButton=By.xpath("//button[@id=\"send2-login\"]");
    public static By search=By.xpath("//input[@id=\"search\"]");
    public static By searchList=By.xpath("//div[@class=\"product-line product-name\"]");
    public static By addToCart=By.xpath("//button[@id=\"product-addtocart-button\"]");
    public static By selectType=By.xpath("//div[@data-option-id=\"5467\"]");
    
    public static WebElement signInLink() {
		return driver.findElement(signInLink);
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
    
    public static WebElement search() {
		return driver.findElement(search);
	}
    
    public static List<WebElement> searchList() {
		return driver.findElements(searchList);
	}
    
    public static WebElement addToCart() {
    	return driver.findElement(addToCart);
    }
    
    public static WebElement selectType() {
    	return driver.findElement(selectType);
    }

}
