package com.sundayPracticeXml;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class xmlpractice2 {
	
	WebDriver driver;
	@BeforeMethod
	public void beforeMethod(){
		

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		
		
	}

	@Test
	@Parameters("url")
	public void test1(String url) throws InterruptedException{
		driver.get(url);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[text()='Men']")).click();
		//driver.findElement(By.xpath("//*[text()='Men's Grooming']")).click();
	
	}
	
}
