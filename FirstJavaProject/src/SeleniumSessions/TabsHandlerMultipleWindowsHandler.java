package SeleniumSessions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabsHandlerMultipleWindowsHandler {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver drive = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://amazon.in");
		String currentHandle = driver.getWindowHandle();
//
////######### Mentod 1: Using robot claas.
////Robot is a class that takes care of the key events. so we will instantiate an object of the robot class.
//// Open a new tab using Cntrl+T.
//		
//		Robot r = new Robot();
//		r.keyPress(KeyEvent.VK_CONTROL);
//		r.keyPress(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_T);
//		r.keyRelease(KeyEvent.VK_CONTROL);
//		
//// create a set to collect all windowhandles.
//		Set<String> handles = driver.getWindowHandles();
//		for(String actual:handles)// for all window handles.
//			{
//			
//			if(!actual.equalsIgnoreCase(currentHandle))
//	// while actual handle is not the one refered by currenthandle (parent)
//	// switch to actual tab. and open url.
//			{			
//					driver.switchTo().window(actual);
//					driver.get("http://flipKart.com");
//					Thread.sleep(5000);
//					//driver.switchTo().window(currentHandle);
////or use this to switch to parent tab.
//					driver.switchTo().defaultContent();
//					
//			}
//		}
//
		
		
		
////#### Method 2
////driver.quit();
//
//		((JavascriptExecutor)driver).executeScript("window.open()");
//		
//		// create a set to collect all windowhandles.
//				Set<String> handles = driver.getWindowHandles();
//				for(String actual:handles)// for all window handles.
//					{
//					
//					if(!actual.equalsIgnoreCase(currentHandle))
//			// while actual handle is not the one refered by currenthandle (parent)
//			// switch to actual tab. and open url.
//					{			
//							driver.switchTo().window(actual);
//							driver.get("http://flipKart.com");
//							Thread.sleep(5000);
//							driver.switchTo().defaultContent();
//							//driver.switchTo().window(currentHandle);
//		//or use this to switch to parent tab.
//							
//							
//					}
//				}
//
//	}
		//Method 3 using Action class
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}
	
	
	
	
	
}
