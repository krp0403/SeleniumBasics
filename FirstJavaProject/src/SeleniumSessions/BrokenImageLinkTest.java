//#### This programm is for finding active links from total links present on the webpage.

package SeleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.net.URLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImageLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

			
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			
			driver.get("http://www.amazon.com");
		//	driver.get("https://makemysushi.com/404");
			Thread.sleep(5000);// explicit wait
//We will now find all links and imanges on the page using findelements method		
//Also, we have created a list  to gather them at one place.
			List<WebElement> list = driver.findElements(By.tagName("a"));// all links start with tag <a>
			//List<WebElement> ImageList = driver.findElements(By.tagName("img"));
			list.addAll(driver.findElements(By.tagName("img")));// all images start with tab <img>
			
			System.out.println("The total number of links and imanges on the home page are "+ list.size());// total count
			List <WebElement> activelist = new ArrayList<WebElement>(); // new arraylist for iteration 
			
			for (int i=0;i<list.size();i++){
//System.out.println(list.get(i).getAttribute("href"));
// lets check the items from list object for any javascript tags or null values to avoid those links.
				if(list.get(i).getAttribute("href")!=null && (!list.get(i).getAttribute("href").contains("javascript") && (!list.get(i).getAttribute("href").contains("*")))){
				activelist.add(list.get(i));// adding only active links to the new arraylist created.
				}
			
			}
// now lets print the active links total number.
			System.out.println("The total number of active images and links is " + activelist.size());
			
			for (int j= 0;j<activelist.size();j++){
				
// httpUrlconnection is a class used to create http connections on urls . 
// now we will cast our url from the active link list item and try and open the connection.
				HttpURLConnection connection = 	(HttpURLConnection) new URL(activelist.get(j).getAttribute("href")).openConnection();
// below will explicitly open the connection (without a browser). Get the response code and close the connection.
				connection.connect();
				String response = connection.getResponseMessage();
				connection.disconnect();
				System.out.println(activelist.get(j).getAttribute("href")+"--->"+ response); // print the response received against active links poled.
			}
			
			driver.quit();

	}

}
