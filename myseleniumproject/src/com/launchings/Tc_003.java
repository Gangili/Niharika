package com.launchings;

public class Tc_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		launch("edgebrowser");
		navigateurl("amazonurl");
		
		windowMaximize();
		
		 String title = windowTitle();
		 System.out.println(title);
		
		
		 String url = windowCurrentUrl();
		 System.out.println(url);
		
		deleteAllCookies();
		
		windowBack();
		
		waitForElement(5000);
		
		windowForward();
		
		waitForElement(5000);
		
		windowRefresh();
		
		windowClose();
		
		
		
	}

	

	
}
