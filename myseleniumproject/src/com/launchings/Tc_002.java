package com.launchings;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_002 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
       launch("chromebrowser");
       navigateurl("amazonurl");
       
       selectOption("amazonsearchdropbox_id","Books");
       
       typeText("amazonsearchtextbox_name","Harry Potter");
       
       clickElement("amazonsearchbutton_xpath");
  
       
       //WebElement loc = driver.findElement(By.id("searchDropdownBox"));
       //loc.sendKeys("Books");
       
       //driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
       
       //driver.findElement(By.name("field-keywords")).sendKeys("Harry Potter");
       
       //driver.findElement(By.xpath(" //input[@id='nav-search-submit-button']")).click();
       
       //driver.findElement(By.linkText("Customer Service")).click();
       
       //driver.findElement(By.partialLinkText("Customer Serv")).click();
       
       
       //List<WebElement> link = driver.findElements(By.tagName("a"));
       //for(int i=0;i<link.size();i++)
       //{
    	   
    	   //if(!link.get(i).getText().isEmpty())
    	   //{
    	   //System.out.println(link.get(i).getText());
           //}
       //}
       
	}

	
}
