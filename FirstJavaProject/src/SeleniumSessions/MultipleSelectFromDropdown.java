//	### Multiple select 
//		Launch new Browser
//		Open “http://toolsqa.com/automation-practice-form/”
//		Select ‘Continents’ Drop down ( Use Id to identify the element )
//		Select option ‘Europe’ (Use selectByIndex)
//		Select option ‘Africa’ now (Use selectByVisibleText)
//		Print all the options for the selected drop down and select one option of your choice
//		Close the browser
		

package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class MultipleSelectFromDropdown {

	public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			WebDriver drive = new ChromeDriver();
		
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			
			driver.get("http://toolsqa.com/automation-practice-form/");

	
	}

	
}
