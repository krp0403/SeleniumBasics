package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingDropDown {

	public static void main(String[] args) {

		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/mercuryregister.php");
		Select select = new Select(driver.findElement(By.xpath(("//select[@name='country']"))));
		select.selectByValue("92");
		
	//	Select select = new Select(driver.findElement(By.xpath("//*[@id='dropdownCurrency']")));
		//driver.findElement(By.id("dropdownLangauge")).click();
		//driver.findElement(By.id("dropdownCurrency")).click();
		//driver.findElement(By.tagName("EUR"));
	//
	}

}
