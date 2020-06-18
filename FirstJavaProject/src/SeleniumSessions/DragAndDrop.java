package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0); // switching to the frame on the web page. If at all there are frames on the web page.
		
		Actions action = new Actions(driver);//  creating a action class and its object 
		// an object of Actions class is required to perform the drag and drop function
		
		action.clickAndHold(driver.findElement(By.id("draggable")))// click and hold the object
		.moveToElement(driver.findElement(By.id("droppable")))// move the object to destination object.
		.release().build().perform();// release the object and build and perform are Action class functions that are mandatory to complete the action.
		System.out.println("We so far have dragged and dropped a table onto another table.Thus successfully executed drag drop in selenium");
		
//		action.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		
		
		
		
		driver.close();
	
	
	
	
	
	}

}
