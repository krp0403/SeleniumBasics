package com.test;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestGroupsNdependsOnFunctions {
	
	WebDriver driver;
	
	@BeforeMethod
	public void before(){
		
		System.out.println("In before method");
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://www.google.com");		
		
	}


	
	@Test(dependsOnMethods="LaunchBrowser", priority=1) 
	 public void login(){
		
		System.out.println("In login method which depends on launchbrowser");
		 
	 }

	@Test(dependsOnMethods="Testpriority",priority=3)
	public void LaunchBrowser(){
		System.out.println("In launchBroser");
	}
	
	@Test(priority=4)
	public void Testpriority(){
		System.out.println("In Test priority method");
		
		 Assert.assertEquals(true, false);
		
		
	}
	@AfterMethod
	public void teardown(){
		
	driver.quit();
	}

}
