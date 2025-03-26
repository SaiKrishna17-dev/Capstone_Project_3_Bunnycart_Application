package com.Bunnycart.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Bunnycart.Browser.Browser;

public class CreateAccountPageObjects extends Browser {
	
	public static By creat =By.xpath("//a[@class='customer-register-link']");
	public static By firstname = By.xpath("//input[@id='firstname']");
	public static By lastname = By.xpath("//input[@id='lastname']");
	public static By email = By.xpath("//input[@id='popup-email_address']");
	public static By pass = By.xpath("//input[@id='popupPassword']");
	public static By passconfirm = By.xpath("//input[@id='password-confirmation']");
	public static By whatsapp = By.xpath("//input[@placeholder='WhatsApp Number']");
	public static By creatbutton = By.xpath("//button[@title='Create an Account']");
	
	
	
	public static WebElement creatAccount() {
		return driver.findElement(creat);
	}
	public static WebElement firstName() {
		return driver.findElement(firstname);
	}
	public static WebElement lastName() {
		return driver.findElement(lastname);
	}
	public static WebElement email() {
		return driver.findElement(email);
	}
	public static WebElement password() {
		return driver.findElement(pass);
	}
	public static WebElement confirmPassword() {
		return driver.findElement(passconfirm);
	}
	public static WebElement whatsAppNumber() {
		return driver.findElement(whatsapp);
	}
	public static WebElement ceretButton() {
		return driver.findElement(creatbutton);
	}

}
