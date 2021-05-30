package com.launchings;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest 
{

	public static WebDriver driver;
	public static String projectpath = System.getProperty("user.dir");
	public static Properties p;
	public static FileInputStream fis;
	public static Properties mainpro;
	public static Properties childpro;
	public static Properties orpro;
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectpath +"//data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectpath +"//environment.properties");
		mainpro = new Properties();
		mainpro.load(fis);
		String e = mainpro.getProperty("env");
		System.out.println(e);
		
		
		fis = new FileInputStream(projectpath +"//"+e+".properties");
		childpro = new Properties();
		childpro.load(fis);
		String value = childpro.getProperty("amazonurl");
		System.out.println(value);
		
		
		fis = new FileInputStream(projectpath +"//or.properties");
		orpro = new Properties();
		orpro.load(fis);
		
		
		
		
		
		
	}
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver","C:\\Users\\munni\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe" );
			 
			 
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\munni\\eclipse-workspace\\myseleniumproject\\drivers\\chromedriver_win32\\chromedriver.exe");
		     driver = new ChromeDriver();
		}
		
		else if(p.getProperty(browser).equals("edge"))
		{
			//System.setProperty("webdriver.edge.driver","C:\\Users\\munni\\Desktop\\Selenium\\edgedriver_win32\msedgedriver.exe" );
			
			System.setProperty("webdriver.edge.driver",projectpath+"//drivers//edgedriver_win32//msedgedriver.exe");
	        driver = new EdgeDriver();
		}
	}
	
	public static void windowMaximize() 
	{
		driver.manage().window().maximize();
		
	}
	public static String windowTitle() 
	{
		  //String title = driver.getTitle();
		 // System.out.println(title);
		 return driver.getTitle();
	}
	public static String windowCurrentUrl() 
	{
		String url = driver.getCurrentUrl();
		//System.out.println(url);
		return url;
		
	}
	public static void deleteAllCookies() 
	{
		driver.manage().deleteAllCookies();
		
	}

   

	public static void windowForward() 
	{
		driver.navigate().forward();
		
	}
	public static void waitForElement(int timeInMilliSeconds) throws Exception
	{
		Thread.sleep(timeInMilliSeconds);
		
	}

	public static void windowBack() 
	{
		driver.navigate().back();
		
	}
	public static void windowRefresh() 
	 {

	      driver.navigate().refresh();
			
	} 

	public static void windowClose() 
     {
		
    	 driver.close();
	}
	
	public static void clickElement(String locatorKey) 
	{
		getElement(locatorKey).click();
		
		//driver.findElement(By.xpath(orpro.getProperty(locatorkey))).click();
	       
		
	}

	public static void typeText(String locatorKey, String text) 
	{
		getElement(locatorKey).sendKeys(text);;		
		//driver.findElement(By.xpath(orpro.getProperty(locatorkey))).sendKeys(text);
	}

	public static void selectOption(String locatorKey, String option) 
	{
		getElement(locatorKey).sendKeys(option);
		//driver.findElement(By.id(orpro.getProperty(locatorkey))).sendKeys(option); 
		
	}
	public static WebElement getElement(String locatorKey)
	{
		
		
		WebElement element = null;
		
		if(locatorKey.endsWith("_id"))
		{
			element = driver.findElement(By.id(orpro.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_name"))
		{
			element = driver.findElement(By.name(orpro.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_classname"))
		{
			element = driver.findElement(By.className(orpro.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_xpath"))
		{
			element = driver.findElement(By.xpath(orpro.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_css"))
		{
			element = driver.findElement(By.cssSelector(orpro.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_linktext"))
		{
			element = driver.findElement(By.linkText(orpro.getProperty(locatorKey)));
			
		}
		else if(locatorKey.endsWith("_partialLinktext"))
		{
			element = driver.findElement(By.partialLinkText(orpro.getProperty(locatorKey)));
			
		}
		return element;
		
	}


	

	
	public static void navigateurl(String url)
	{
		driver.get(childpro.getProperty(url));
	}
		

	

}
