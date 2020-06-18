package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandler {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
				
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(3000);
		// this is explicit sleep time
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept(); // this will click on the ok button on the alert.
		//alert.dismis() is the function to dismiss cancel the alert.
	}

}
