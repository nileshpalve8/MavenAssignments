package com.selenium.locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class demoblaze {

	public static void main(String[] args) {
		// Launch the browser window(Browser = Microsoft Edge)
		WebDriver driver = new EdgeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Delete all browser cookies
		driver.manage().deleteAllCookies();

		// Enter URL and Launch the application(https://www.demoblaze.com/)
		driver.get("https://www.demoblaze.com/");
		
		//for total number of images
		List<WebElement> image=driver.findElements(By.tagName("img"));
		System.out.println("Total no. of images:" +image.size());
		
		//for total number of images
		List<WebElement> link=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links:" +link.size());
		
		//click on any product using linktext/partiallinktext
		driver.findElement(By.linkText("Laptops")).click();

	}

}
