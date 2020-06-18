package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//In TestNG all the test cases are run as a pair of "Precondition-Testcongidion - and post condition. 
// that is if there are 3 tests to be performed on a browser. Then 3 tests will initiate 3 instances of a browser. 
//we can also set the priority of tests (sequence) by using the keyword priority next to @Test notation as seen below.

//### a TESTNG test case consists of 1. @BeforeMethod. 2. @Test(actual test case) 3.@AfterMethod
// groups keyword is used for grouping test cases based on custom / user defined grouping.
// enabled keyword is for ignoring the test case :- @Test(Enabled) \n public void ignore test(){}

//### TestNG creates a html based report after the test are executed. it is stored under the tes-output folder\index.html.
// we should refresh the project (right click - refresh) to get the latest test execution html report.
	public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setup(){
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("http://www.google.com");

	}
	
	@Test(priority=3,groups="Title")
	public void GoogleTitleTest(){
	
	String A1 = driver.getTitle();
	System.out.println(A1);
	Assert.assertEquals(A1, "Google","Titles do not match");
	}

	@Test(priority=2,groups="Logo")
	public void GoogleLogoTest(){
		boolean B1 = driver.findElement(By.xpath("//*[@id='hplogo']")).isDisplayed();
		Assert.assertTrue(B1);
		Assert.assertEquals(B1, true);
}
	
	@Test(priority=1,groups="LinkTest")
	public void mailTextTest(){
		driver.findElement(By.linkText("Gmail")).isDisplayed();
		
	}
	
	@AfterMethod
	public void TearDown(){
		driver.quit();
	}

}

