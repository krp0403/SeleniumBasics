package com.TestParametersInTestNg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TestUtility.ReadDataFromExcel;

public class TestDataprovider {

WebDriver driver;
	
	 
@BeforeMethod
public void SetUp(){

	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
	driver.get("http://newtours.demoaut.com/mercuryregister.php");
	
}

//@Test
//public void print(){
//	System.out.println("here");
//}

@DataProvider
public Iterator<Object[]> getdata(){
	ArrayList<Object[]> testData = ReadDataFromExcel.getDataFromExcel();
	return testData.iterator();
}


@Test(dataProvider="getdata") 
public void RegisterOnSite(String firstname, String lastname, String phone, String email, String address1,
		String address2, String city, String state, String postalCode, String username, String password, String confrimPassword)
{
	
	driver.findElement(By.xpath("//input[@name='firstName']")).clear();
	driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
	
	driver.findElement(By.xpath("//input[@name='lastName']")).clear();
	driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
	
	driver.findElement(By.xpath("//input[@name='phone']")).clear();////input[@name="phone"]
	driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
	
	driver.findElement(By.xpath("//input[@name='userName']")).clear();
	driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
	
	driver.findElement(By.xpath("//input[@name='address1']")).clear();
	driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address1);
	
	driver.findElement(By.xpath("//input[@name='address2']")).clear();
	driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(address2);
	
	
	driver.findElement(By.xpath("//input[@name='city']")).clear();
	driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
	
	
	driver.findElement(By.xpath("//input[@name='state']")).clear();
	driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
	
	driver.findElement(By.xpath("//input[@name='postalCode']")).clear();
	driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalCode);

	driver.findElement(By.xpath("//input[@name='email']")).clear();
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys(username);
	
	driver.findElement(By.xpath("//input[@name='password']")).clear();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	
	
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).clear();
	driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confrimPassword);


}



@AfterMethod
public void TearDown(){
	driver.quit();
}
}
