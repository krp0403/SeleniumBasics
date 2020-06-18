package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisibilityTest {

	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	
//***** This code tests whether a perticular element is visible/enabled/selected.
		// isSelected method is only for the drop down menu, checkboxes and radio buttons and not for the text/ input /links.
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
//below code is valid and can be run. it is commented to try the next block.
		
	/*	driver.get("https://ui.freecrm.com/");
		boolean b1 = driver.findElement(By.cssSelector(".fluid")).isDisplayed();
		System.out.println("Is the login button disolayed? Answer is "+ b1);
		boolean b2 = driver.findElement(By.cssSelector(".fluid")).isEnabled();
		System.out.println("Is the login button Enabled? The answer is " +b2);
	 	*/
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.id("sex-0")).click();
		boolean b1 = driver.findElement(By.id("sex-0")).isSelected();// to verify if the radio button is selected or not?
		
				if(b1== true){
				System.out.println("The  radio button is selected");
				}
				else if (b1 == false ){ 
					System.out.println("The radio buton is not selected");
				}
					
		driver.findElement(By.id("profession-0")).click();// now check the checkbox
		boolean b2 = driver.findElement(By.id("profession-0")).isSelected();
		
		if (b2 == true){
			System.out.println("The check box is selected");
			
		}
		else if (b2 == false){
			System.out.println("The check box is not selected");
		}
		
		driver.findElement(By.id("profession-0")).click();// now check thecheckbox
		boolean b3 = driver.findElement(By.id("profession-0")).isSelected();
		
		if (b3 == true){
			System.out.println("The check box is selected");
			
		}
		else if (b3 == false){
			System.out.println("The check box is not selected");
		}
				
		driver.close();
		
				}
				
				
		
		

	}


