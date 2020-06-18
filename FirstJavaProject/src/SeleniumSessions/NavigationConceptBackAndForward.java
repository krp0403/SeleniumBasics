package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationConceptBackAndForward {

	public static void main(String[] args) throws InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		// aboe "navigate().to(url) is used to navigate to a different url while user is already on a web url.
		// driver.get(url) is used to launch a fresh url regardless of whether user's current status.
		
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh(); // to refresh the current page.


		
		
		
		driver.close();
	}

}
