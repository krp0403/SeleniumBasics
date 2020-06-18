package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fcommunity.ebay.com%2Ft5%2FHalf-com%2Fbd-p%2F21000000002");
		driver.findElement(By.xpath("//*[@id='firstname']")).sendKeys("tom");
		driver.findElement(By.xpath("//*[@id='lastname']")).sendKeys("Alter");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("test@test.com");
		
	//by.id
		driver.findElement(By.id("firstname")).sendKeys("Tom");
		driver.findElement(By.id("lastname")).sendKeys("Alter");
		
//by.name
		driver.findElement(By.name("firstname")).sendKeys("Tom");
		
// by.linktext
		driver.findElement(By.linkText(" Create a business account")).click();
		
// by cssselector
		driver.findElement(By.cssSelector("#firstname")).sendKeys("test");
		*/
		
		driver.get("https://www.google.co.in/");
		//driver.findElement(By.cssSelector(".gLFyf")).sendKeys("Pune");
		driver.findElement(By.linkText("Business")).click();
		
		//***** Selecting the dropdown****
//
		
		
		
	
	}

}
