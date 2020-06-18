package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlDriver4HeadlessExecutionConcept {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	//WebDriver driver = new ChromeDriver();

		WebDriver driver = new HtmlUnitDriver();
		
		// htmlUnitDriver is not part of Selenium 3.x.
		// We need to download the HtmlUnitDriver Jar file.
		// from https://github.com/SeleniumHQ/htmlunit-driver/releases
		
		// *****debug why it works with webdriver and not with htmlunit driver :( 
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("https://ui.freecrm.com/");
		Thread.sleep(2000);
		System.out.println("Title before loging in is " +driver.getTitle());
		Thread.sleep(1000);
		//driver.findElement(By.name("email")).sendKeys("krppmp@gmail.com");
		driver.findElement(By.xpath(" //input[@type='text']")).sendKeys("krppmp@gmail.com");
		//driver.findElement(By.name("password")).sendKeys("Test@1234");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Test@1234");
				//driver.findElement(By.className("ui fluid large blue submit button")).click();
		driver.findElement(By.cssSelector(".fluid")).click();
		System.out.println("After login the page title is" +driver.getTitle());
	}

}
