package SeleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesConcept {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
// create the object of properties class to deal with the properties function.

		Properties prop = new Properties();
// Now create the object of the file input stream class to connect the java code to the config file at its location as seen below. 
		
		FileInputStream FP = new FileInputStream("C:\\Users\\dell\\workspace\\FirstJavaProject\\src\\SeleniumSessions\\config.properties");
// now load the file using the object of the properties class.
		prop.load(FP);
	
		// Now lets use the value from the properties file.
		
		System.out.println("The name stored in config file is  " + prop.getProperty("Name"));
		// similarly we can print other values stored in the properties file lets see.
		
		System.out.println("The age stored in config file is  " + prop.getProperty("Age"));
		System.out.println("The Address stored in config file is  " + prop.getProperty("Address"));
		System.out.println("The phone number stored in config file is  " + prop.getProperty("phone"));
		 
		String BrowserName = prop.getProperty("browser");
		System.out.println("The browser name in config file is  " + BrowserName);
		
	String url = prop.getProperty("url");// read url from the config file.
	
	// now choose the browser based on value of the browser from config file.
	if(BrowserName.equals("chrome")){
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
	}
		
	else	if (BrowserName.equals("FF"))	{
			System.setProperty("webdriver.gecko.driver","e:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
	}

		driver.get(url);
		//below commands will read the xpath for fields and enter the value for the fields using the config file.
		driver.findElement(By.name(prop.getProperty("Firstname_name"))).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.name(prop.getProperty("Lastname_name"))).sendKeys(prop.getProperty("Lastname"));
		driver.close();
	
	}
}
