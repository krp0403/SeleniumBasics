package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		/*driver.get("https://www.bing.com/?cc=in");
		driver.findElement(By.xpath("//input[@class='sb_form_q']")).sendKeys("Google");
		System.out.println("This is good so far");
		driver.findElement(By.xpath(//))
		*/
		
		//driver.get("https://www.goair.in/");
		driver.get("https://www.amazon.in/");
		
		// get total count of links on the page.
		//get the text of each link on the page
		
		 List <WebElement> linkList = driver.findElements(By.tagName("a"));
		
		 //above command will find all links on the flipkart website since all html tags starts with "a"
		//and store it in the list called linklist (object of list).
		
		 // print size of link list array
		 System.out.println("The total number of links on the website is " + linkList.size());
		 
		 for (int i = 0;i<linkList.size();i++){
			 String LinkText = linkList.get(i).getText();
			 System.out.println(LinkText);
			 System.out.println("Link number is " +i);
		 }
		 
		
driver.close();
	}

}
