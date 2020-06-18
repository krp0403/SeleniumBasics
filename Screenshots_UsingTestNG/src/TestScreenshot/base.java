package TestScreenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;

public class base {

	public static WebDriver driver;
	public static void initialization(){
// this is the initialization function to set the browser property and invoke the url.
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
	
	}

	public void failed(String TestMethodName){
// in above line we have defined a string parameter to use while taking screenshot with the failing method name.
// this is the main faiLed function definition that will take screenshots for every failing test case
		File ScrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(ScrFile, new File("C:\\Users\\dell\\workspace\\Screenshots_UsingTestNG\\Screenshots\\" +TestMethodName+"_"+".jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
