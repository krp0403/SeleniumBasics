package SeleniumSessions;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalendarHandlingTestMethod2 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		// lets take a date to select from the calendar
		String date= "29-February-2019";
		// Now split it to get the different parts
		String dt[]=date.split("-");

		// store the day month and year in a string array.
		String day = dt[0];
		String mnth = dt[1];
		String yr = dt[2];

		//launch url.
		driver.get("http://www.demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();

		Select month = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")));
		month.selectByVisibleText(mnth);
		Select year = new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']")));
		year.selectByVisibleText(yr);

		// in order to be able to select the day value lets look at the pattern of xpaths for day value and break them into -->>
		String beforeXpath = "//*[@id='dateOfBirth']/div[2]/div[2]/div/div/div[2]/div[2]/div[";
		String afterXpath = "]/div[";

		// now lets write the logic 

		final int Weekdays=7; // weekdays cannot be more than 7 so making it final so that none can alter it.
		boolean flag = false;
		String dayVal;// class variable

		for (int rowNum = 2; rowNum<7;rowNum++)// days start from second row and in a calendar there can be maximum 7 rows.
		{
			for (int Colnum=1; Colnum<=Weekdays;Colnum++){// weekdays start from 1st column and goes upto 7 columns as days are7.

				try{// for the sake of invalid date entries.
					// lets try and find a particular xpath using the for loop combination. rownum+colnum and see if the xpath value matches the day value from var=day
					dayVal = driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+Colnum+"]")).getText();
				}catch (NoSuchElementException e){
					System.out.println("Please enter a valid date");
					flag = true;
					break;
				}

				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+Colnum+"]")).click();
					flag= true;
					break;
				}
			}
			// if the condition is satisfied then come out of the inner for loop. so the break statement.			
			if(flag){
				break;}
		}
	}




}


