package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasics {

	
	//####Anotations starting with @Before are called as pre-conditions in TestNG
	@BeforeSuite
	public void setUp(){
		System.out.println("setup System Property for Chrome");
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
	
	}
	
	@BeforeClass
	public void launchBrowser(){
		System.out.println("Launch Chrome Browser");
		
	}


@BeforeMethod
	public void enterUrl(){
		System.out.println("Enter Url");
	}

	@BeforeTest
	public void  login(){
		System.out.println("Login Method");

		}

	// # Annotations starting with @Test --- are called Test conditions
	@Test
	public void GoogleTitleTest(){
		System.out.println("Google Title Test");
	}
	
	//### Annotations starting with @After are post conditions.
	@AfterMethod
	public void logout(){
		System.out.println("Log out from the webesite");
	}

	@AfterTest
	public void deletteAllCookies(){
		
		System.out.println("Delete all cookies");
	}

	@AfterClass
	public void CloseBrowser(){
		System.out.println("Close the browser");
	}
	
	@AfterSuite
	public void generateTestReprot(){
		System.out.println("Send Test report");
		
	}



}