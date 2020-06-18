package com.TesngXmlPractice;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestTestngXml {

	WebDriver driver;
	
	@Test
	@Parameters("url")
	public void TestXml(String url){
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get(url);// 
	}
	
	
	

}
