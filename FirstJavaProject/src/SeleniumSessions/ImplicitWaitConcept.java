package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		
		
		driver.get("https://jqueryui.com/droppable/");
		// The below are the examples of dynamic wait function. Where the function would not wait full time allotted. The execution 
		// would continue as the object/ page is loaded. unlike the Thread.sleep() function which is a hard wait.The execution waits full allotted time.
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

	}

}
