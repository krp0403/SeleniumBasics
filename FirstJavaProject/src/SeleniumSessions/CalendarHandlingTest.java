//##### This program helps deal with web calendar entries using different use cases

package SeleniumSessions;

import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandlingTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver drive = new ChromeDriver();


		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("http://ui.freecrm.com");
		driver.findElement(By.xpath("//*[@name='email']")).sendKeys("krppmp@gmail.com");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("// i[@class='calendar icon']")).click();
		Thread.sleep(2000);

		String Date= "01-June-2020";
		String DateVal[] = Date.split("-");

		String day = DateVal[0];
		String month = DateVal[1];
		String year = DateVal[2];
		String dt = driver.findElement(By.xpath("//*[@Class='rbc-toolbar-label']")).getText();
		System.out.println(dt);
		//if(dt.te(month + year)){
		if (dt.equalsIgnoreCase(month+" "+year)){
			driver.findElement(By.linkText(day)).click();
			Thread.sleep(2000);
			System.out.println("We are on the page for the date "+ day +" "+  month+" "+ year );
			//			String date = driver.findElement(By.xpath("//*[@Class='rbc-toolbar-label']")).getText();
			//			assert.date.contains(day);
		}}}
//Assert.assertEquals(day, driver.findElement(By.xpath("//*[@Class='rbc-toolbar-label']")).getText()


