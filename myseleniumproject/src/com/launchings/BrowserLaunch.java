package com.launchings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BrowserLaunch 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\munni\\Desktop\\selenium\\chromedriver_win32\\chromedriver.exe" );
		 driver = new ChromeDriver();
		 driver.get("https://www.aldi.com");
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\munni\\Desktop\\selenium\\edgedriver_win32\\msedgedriver.exe" );
	     driver = new EdgeDriver();
	     driver.get("https://www.walmart.com");
	    
	}
	

}
