package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
	driver.get("https://www.flipkart.com");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();

	Thread.sleep(5000);
	
driver.findElement(By.xpath("//*[text()='TVs & Appliances']")).click();

	
	//act.moveToElement(driver.findElement(By.xpath("//li[@Class='Wbt_B2 _1YVU3_']//span[@Class='_1QZ6fC _3Lgyp8' and text()='TVs & Appliances']))"))).build().perform();	
//	act.moveToElement(By.cssSelector("#container > div > div.zi6sUf > div > ul > li:nth-child(2) > span")
	//act.moveToElement(By.xpath("/html/body/div[1]/div/div[2]/div/ul/li[2]/span")).build().perform();
	/*	driver.get("https://www.goair.in/");
		
	 #### Working code snippet 1. 
	  
	 
		//**here we have to create an object of the ACTIONS class to start working with mouseover function and provide the webdriver (driver) object as reference).
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("About Us"))).build().perform();
		Thread.sleep(3000);
		//action.movetoemelemt will move the cursor to the element found by driver in () and .build().perform() will perform the action.
		// so here the mouse will be moved to about us menu. Lets run and check.
		//System.out.println("so far so good till moving to about us menu");
		driver.findElement(By.linkText("Contact Us")).click();
		
	*/
		

	}

}
