package com.selenium.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class basicLocators {

	public static void main(String[] args) {
		// Launch the browser window(Browser = Microsoft Edge)
		WebDriver driver = new EdgeDriver();

		// Maximize the browser window
		driver.manage().window().maximize();

		// Delete all browser cookies
		driver.manage().deleteAllCookies();

		// Enter URL and Launch the application(https://www.google.co.in/)
		driver.get("https://www.google.co.in/");

		// Locate the WebElement google search text box using 'id' Locator
		driver.findElement(By.id("APjFqb"));

//		6. Locate the WebElement google search text box using 'name' Locator
		driver.findElement(By.name("q"));

//		7. Locate the WebElement google search text box using 'className' Locator
		driver.findElement(By.className("gLFyf"));

//		8. Locate the WebElement google search text box using 'tagName' Locator
		driver.findElement(By.tagName("textarea"));

//		9. Locate the WebElement 'How Search Works' hyperlink using 'linkText' Locator
		driver.findElement(By.linkText(" How Search works "));

//		10. Locate the WebElement 'How Search Works' hyperlink using 'partialLinkText' Locator
		driver.findElement(By.partialLinkText("How Search"));
		
		//
		
		

	}

}
