package com.TestParametersInTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class XmlParametersForTestNg {
	
	WebDriver driver;

	@Test
	@Parameters({"url", "emailId"})// This is the Testng annotation to use parameters from the xml file. We declare the ref vars here.
	
	public void TestLogin(String url, String emailId){// here we have to create 1:1 mapping of variables to those referred from xml.
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get(url);// url is defined in testng.xml file.
		driver.findElement(By.xpath("//input[@class='phone-no ']")).clear();
		driver.findElement(By.xpath("//input[@class='phone-no ']")).sendKeys(emailId);// emailid is defined in testng.xml file.
	//	driver.findElement(By.xpath("//*[@id='identifierNext']/span/span")).click();
//	driver.close();
	
	
	}
	

}
