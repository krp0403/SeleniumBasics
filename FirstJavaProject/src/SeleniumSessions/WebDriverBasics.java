package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// launch firefox browser using geckodriver.
	
	/*System.setProperty("webdriver.gecko.driver","E:\\selenium\\geckodriver-v0.26.0-win64\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.esakal.com");
	driver.close();
	//driver.quit();
	*/
	
	//chrome driver.
	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	String Title = driver.getTitle();
	System.out.println("The tilte of the webpage is " + Title );
	
	if (Title.equals("Google")){
		System.out.println("Title is correct");
		
	}
	
	else {
		System.out.println("Title is in-correct");
	}
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	
	driver.close();
	}

}
