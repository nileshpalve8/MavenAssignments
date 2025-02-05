package com.maven.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParaBankLocator {

	public static void main(String[] args) {
		//1. Launch the Browser window (Browser = Chrome) 
		WebDriver driver = new ChromeDriver();

		//2. Maximize the browser window  
		driver.manage().window().maximize();

		//3. Delete all browser cookies 
		driver.manage().deleteAllCookies();

		//4. Enter URL and Launch the Application (https://www.google.co.in/)  
		driver.get("https://www.google.co.in/");
		
		//5. Enter URL and Launch the Application (https://parabank.parasoft.com/parabank/index.htm)  
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		
		//6.Locate the WebElement services 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(3) > a"));
		
		//7.Locate the WebElement Solutions 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(1)"));
		
		//8.Locate the WebElement Products 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(4) > a"));
		
		//8.Locate the WebElement Locations 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(5) > a"));
		
		//8.Locate the WebElement Admin Page 'cssSelector' Locator
		driver.findElement(By.cssSelector("ul[class='leftmenu'] > li:nth-child(6) > a"));
		
		//Locate web element ATM Services
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(1)"));//ATM Service
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(2) > a"));//Withdraw Funds
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(3) > a"));//Transfer Funds
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(4) > a"));//Check Balance
		driver.findElement(By.cssSelector("ul[class='services'] > li:nth-child(5) > a"));//Make Deposits
		
		//Locate web element Online Service
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(1)"));//Online Service
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(2)>a"));//Bill Pay
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(3)>a"));//Account History
		driver.findElement(By.cssSelector("ul[class='servicestwo'] > li:nth-child(4)>a"));//Transfer Funds
		
		//Locate web element for footerPanel
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(1)>a"));//Home
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(2)>a"));//About Us
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(3)>a"));//Services
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(4)>a"));//Products
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(5)>a"));//Locations
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(6)>a"));//Forum
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(7)>a"));//Site Maps
		driver.findElement(By.cssSelector("div[id=\"footerPanel\"] > ul>li:nth-child(8)>a"));//Contact Us
		
		//Parasoft. All rights reserved.
		
		driver.findElement(By.cssSelector("p[class=\"copyright\"]"));
		
		// Visit Us
		driver.findElement(By.cssSelector("ul[class=\"visit\"] > li"));
		
		//Locate web element for 02/04/2025
		driver.findElement(By.cssSelector("ul[class=\"events\"] > li:nth-child(1)"));
		driver.findElement(By.cssSelector("ul[class=\"events\"] > li:nth-child(2) > a"));//ParaBank Is Now Re-Opened
		driver.findElement(By.cssSelector("ul[class=\"events\"] > li:nth-child(3) > a"));//New! Online Bill Pay
		driver.findElement(By.cssSelector("ul[class=\"events\"] > li:nth-child(4) > a"));//New! Online Account Transfers
		
		//Locate web element  Customer Login
		driver.findElement(By.cssSelector("div[id=\"leftPanel\"]>h2"));//Customer Login
		driver.findElement(By.cssSelector("form[name=\"login\"]>p>b"));//Username
		driver.findElement(By.cssSelector("form[name=\"login\"]>div[class=\"login\"]>input[type=\"text\"]")).sendKeys("palvenilesh8");//usernamebox
		driver.findElement(By.cssSelector("form[name=\"login\"]>p:nth-child(3)>b"));//password
		driver.findElement(By.cssSelector("form[name=\"login\"]>div[class=\"login\"]>input[type=\"password\"]")).sendKeys("Nilesh123");//passwordbox
		driver.findElement(By.cssSelector("form[name=\"login\"]>div[class=\"login\"]>input[type=\"submit\"]"));//Log-in 
		driver.findElement(By.cssSelector("div[id=\"loginPanel\"]>p:nth-child(2)>a"));//forget login info
		driver.findElement(By.cssSelector("div[id=\"loginPanel\"]>p:nth-child(3)>a")).click();//Register
		

	}

}
