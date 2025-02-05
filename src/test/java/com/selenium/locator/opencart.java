package com.selenium.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class opencart {

	public static void main(String[] args) {
		// Launch the browser window(Browser = Microsoft Edge)
		WebDriver driver = new EdgeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Delete all browser cookies
		driver.manage().deleteAllCookies();

		// Enter URL and Launch the application(https://demo.opencart.com/)
		driver.get("https://demo.opencart.com/");
		
		//for total number of images
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images:" +image.size());

	}

}
