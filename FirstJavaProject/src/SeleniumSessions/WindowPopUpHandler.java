package SeleniumSessions;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/* Notes: 
 * There are following type of pop up
 * Alert - Javascrip pop ups ---> handled through Alert Api (Accept()/ Dismis() functions.
 * File upload/ browse window pop up---> handled through the sendkeys function by giving the file location to be uploaded
 * 	driver.findelement(by.xpath(location of the browse button).sendkeys("File Location");
 * 	The browse button function will only work for the button type = file.
 * 
 * 
 * 
 * */

public class WindowPopUpHandler {

	public static void main(String[] args) throws InterruptedException {
					
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			
			driver.get("http://popuptest.com/goodpopups.html");
			driver.findElement(By.xpath("//a[contains(text(),'3')]")).click();
			
			System.out.println("pop up opened");
			
			Thread.sleep(2000);
			
	// handler is a object of set class   imported from java util. It has no indexes so we cannot use for/ while to iterate its items.
			// hence ww will be using iterator. as seen in code below.
			Set<String> handler = driver.getWindowHandles();
			
			// iterator declaration and initiation.
			Iterator<String> it =  handler.iterator();
			String ParentWindowId = it.next();// handler id is assigned to a var parentwindowid.
		 	System.out.println("Parent window id is " +ParentWindowId);
			
			String childWindowId = it.next(); // iterator value has the child window id.
			System.out.println("The child window id is " +childWindowId );
			
			driver.switchTo().window(childWindowId); // now we need to switch to the pop up window using this command.
			Thread.sleep(2000);
			System.out.println("Child window pop up title is "+ driver.getTitle());// confirms that we are on pop up window.
			driver.close();
			
			driver.switchTo().window(ParentWindowId); // switching back to main window.
			Thread.sleep(2000);
			System.out.println("The title of parent window is  " + driver.getTitle());// confirming that we are on main window and focus is not lost.
			
			
				
			}
			
			
	}

 
