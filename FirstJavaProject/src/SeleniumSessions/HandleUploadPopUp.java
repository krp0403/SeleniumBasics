package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleUploadPopUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://html.com/input-type-file/");
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\dell\\Desktop\\contents\\New Text Document.txt");
		System.out.println("execution complete");
//		This file upload will only work for element type = file.

	}

}
