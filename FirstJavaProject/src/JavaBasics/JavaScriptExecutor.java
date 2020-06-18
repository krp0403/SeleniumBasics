package JavaBasics;

// #######This program is for using the javascripexecutor method in selemnium######
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
//## initiate browser
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://ui.freecrm.com");
		driver.findElement(By.name("email")).sendKeys("krppmp@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1234");
//		//driver.findElement(By.xpath("//*[text()='Login']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//*[text()='Login']"));
// call the custom function flash
		flash(loginBtn, driver);
		
	}

// defining custom method flash
public static void flash(WebElement element, WebDriver driver){
	JavascriptExecutor js = ((JavascriptExecutor)driver); // cast the driver to javascripexecutor
	String bgcolor = element.getCssValue("backgroundColor");
	
	for (int i=0; i<10; i++){// for loop for the number of times you wish to flash the web element.
		changeColor("rgb(0,200,0)",element,driver);// invoking the custom changeColor function to set background color 
		changeColor(bgcolor,element,driver);// setting the element's background color back to default
	}
}

// defining the custom changeColor function. 

public static void changeColor(String color,WebElement element, WebDriver driver){
	JavascriptExecutor js = ((JavascriptExecutor)driver);

	js.executeScript("arguments[0].style.backgroundColor  = '"+color+"'", element);
	
	try{
		Thread.sleep(2000);
	}
	
	catch(InterruptedException e){
		
		}
}
}