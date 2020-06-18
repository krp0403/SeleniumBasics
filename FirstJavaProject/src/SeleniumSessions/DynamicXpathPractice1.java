package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DynamicXpathPractice1 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.get("http://ui.freecrm.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("krppmp@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Test@1234");
		driver.findElement(By.cssSelector(".fluid")).click();
		Thread.sleep(3000);		
		// find the contact button from left pane and click on it.
		driver.findElement(By.cssSelector("#main-nav > a:nth-child(3) > span:nth-child(2")).click();
	
		//driver.findElement(By.xpath("//div[@id='main-nav']/a[3])")).click();
		//driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//input[@type='checkbox' and @tabindex='0']")).click();
		
		//##Now the check box element next to an existing contact was not visible to compiler
		// so here we made the element a webelement and used the "Actions" class to move the 
		// mouse cursor to the webelement and made it click. It worked :)
		
		WebElement m1 = driver.findElement(By.className ("hidden")).findElement(By.xpath ("//input[@type='checkbox' and @tabindex='0']"));
		Actions A1 = new Actions(driver);
		A1.moveToElement(m1).click().build().perform();
		
		//#similar is the case in the below case we had to make the dropdown visible by making it a webelement.
		
		WebElement dropdown = driver.findElement(By.xpath("//div[@name='action']"));
		Actions Move = new Actions(driver);
		Move.moveToElement(dropdown).click().build().perform();
		//below command clicks the delete button from the option.
		driver.findElement(By.cssSelector("div.visible:nth-child(3) > div:nth-child(2)")).click();
		// below command is clicking on the view details icon against the contact. (extreme right).
		driver.findElement(By.xpath("//i[@class='unhide icon']")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//### now after coming back to the page we will try and select the same contact and handle the pop up asking delete confirmation.
		
		WebElement M3 = driver.findElement(By.className ("hidden")).findElement(By.xpath ("//input[@type='checkbox' and @tabindex='0']"));
		Actions A3 = new Actions(driver);
		A3.moveToElement(M3).click().build().perform();
 		
		WebElement d2 = driver.findElement(By.xpath("//div[@name='action']"));
		Actions Move2 = new Actions(driver);
		Move2.moveToElement(d2).click().build().perform();
		driver.findElement(By.cssSelector("div.visible:nth-child(3) > div:nth-child(2)")).click();	
		driver.findElement(By.xpath("//div[@role='button' and @tabindex ='0']")).click();
		Thread.sleep(1000);
	
		driver.findElement(By.xpath("//button[text()='Cancel']")).click();
		Thread.sleep(2000);
		//Alert A2= driver.switchTo().alert();
		//A2.dismiss();
			
		driver.close();
		}
		
				
		//driver.findElement(By.xpath("//*[@id="ui"]/div/div[2]/div[2]/div/div[2]/table/tfoot/tr/th[2]/span/div[1]/div[2]/div[2]"))
		
		//driver.close();
		
		
		/*driver.get("https://www.bing.com/?cc=in");
		driver.findElement(By.xpath("//input[@class='sb_form_q']")).sendKeys("Google");
		System.out.println("This is good so far")
		driver.findElement(By.xpath(//))
		*/
		
		//driver.get("https://www.goair.in/");
		//driver.get("https://www.bing.com/");
		/*driver.findElement(By.xpath("//a[@class='umb-home-tabs-bord']")).click();
		driver.findEle/ment(By.xpath("//input[@class='umb-home-web-check-input1 managepnr']")).sendKeys("abcd1234");
		driver.findElement(By.xpath("//input[@class='umb-home-web-check-input manageemail']")).sendKeys("Used");
		System.out.println("Am getting it slow and steady");
		driver.findElement(By.xpath("//button[@class='umb-home-flight-submit-btn1 managebooking']")).click();
		*/
		//Thread.sleep(500);
		 //There are 2 more methods to create xpath. using contains and starts-with function.
		//driver.findElement(By.xpath("//input[contains(@class,'sb_form_')]")).sendKeys("google");
		//Lets try using starts with 
		//driver.findElement(By.xpath("//input[starts-with(@class,'sb_form_')]")).sendKeys("google");
		// there is also a similar method called "ends-with" all remaining syntax remains same.
		
		
		// lets see the custom xpath for links.
		//driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
		
		//driver.close();
		

	}


