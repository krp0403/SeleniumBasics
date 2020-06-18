package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesInBrowser {

	public static void main(String[] args) throws InterruptedException {
		
	
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		
		driver.get("https://ui.freecrm.com/");
		
		//driver.switchTo().frame(arg0); used when there are frames within the web page.
		
		driver.findElement(By.name("email")).sendKeys("krppmp@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.cssSelector(".fluid")).click();
		System.out.println("This is done till here");
		//driver.findElement(By.cssSelector("a.btn:nth-child(10)")).click();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
		driver.findElement(By.linkText("Contacts")).click();
	}

}
