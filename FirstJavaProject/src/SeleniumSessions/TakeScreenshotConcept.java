package SeleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.*;

import org.apache.commons.exec.util.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshotConcept {

	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://www.google.com");
		
		//Below command with take screenshot and save it as a FILE format
		File src = ((TakesScreenshot) driver ).getScreenshotAs(OutputType.FILE);
		// now we will copy the screenshot to desired destination using fileCopy function.
		FileHandler.copy(src, new File("C:\\Users\\dell\\workspace\\FirstJavaProject\\src\\SeleniumSessions\\test.png"));
		System.out.println("File copied to location");
		driver.close();
	}

}
