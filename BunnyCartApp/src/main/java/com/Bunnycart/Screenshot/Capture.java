package com.Bunnycart.Screenshot;


import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Bunnycart.Browser.Browser;

public class Capture extends Browser {
	public static String screenShot(String name) throws Exception { 
		try {
			TakesScreenshot shot = ((TakesScreenshot) driver);
			File source = shot.getScreenshotAs(OutputType.FILE);
			String path = System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";
			File destination = new File(path);
//			FileUtils.copyFile(source, destination);
			
			source.renameTo(destination);
			
			System.out.println("Screenshot taken");
			
			
		} catch (Exception e) {
			System.out.println("Screenshot");
		}
		return  System.getProperty("user.dir") + "\\target\\ScreenShot\\" + name + ".png";
	}
}
