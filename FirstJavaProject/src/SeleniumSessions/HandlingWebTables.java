//##### This program is to handle web table elements on the page. And get data printed on the console.

package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWebTables {

	public static void main(String[] args) throws InterruptedException {
				
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			Thread.sleep(6000);
	
//##### below we are trying to identify a perticular pattern in the xpaths of the webTable's rows and columns. 
//		And break it logically to create actual code readable xpath			
		
			String BeforeXpath = "//*[@id='customers']/tbody/tr[";
			String AfterXpath =  "]/td[1]";
			String AfterXpathContact =  "]/td[2]";// this will shift the column counter to #2. We will read it in separate for loop.
			
		
// now we will try and find the total number of rows from the webtable to avoid hard coding the number of rows while reading the data.

			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
			
			int rowCount = rows.size();// will get the number for the total number of rows in the webtable.
			System.out.println("Totoal number of rows in table are " + rowCount);			
			
			
			for (int i =2; i<=rowCount; i++){// simple for loop to read the rows of webtable using the var rowCount.
				
				String ActualXpath = BeforeXpath + i + AfterXpath;// combine the 2 parts plus the value of i to get the xpath of the row to read.
				WebElement element = driver.findElement(By.xpath(ActualXpath));
				System.out.println(element.getText());
				
				if(element.getText().equalsIgnoreCase("Magazzini Alimentari Riuniti")){// this is validation step to see whether the quoted company name is found in table or not.
					System.out.println("The company name "+ element.getText() + "is found at position # " +(i-1));
					break;
					}
				
			}

			System.out.println("**************************************************");
				
			for (int i =2; i<=rowCount; i++){// simple for loop to read the rows of webtable using the var rowCount.
				
				String ActualXpath = BeforeXpath + i + AfterXpathContact;// combine the 2 parts plus the value of i to get the xpath of the row to read.
				WebElement element = driver.findElement(By.xpath(ActualXpath));
				System.out.println(element.getText());
			}
			
			
//	############ Now lets try and print the number of columns and the count. 
			
			String BeforeColXpath = "//*[@id='customers']/tbody/tr[1]/th[";
			String AfterColXpath =  "]";
// Find the number of columns.
			List<WebElement> col= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr[1]/th"));
			int colCount = col.size();
			System.out.println("THe total number of columns in table are "+colCount); // print number of columns in the table.

//  Now print the column header.
			System.out.println("The column headers are as follows");
			for(int i=1;i<=colCount; i++){
				String actualXpath = BeforeColXpath + i + AfterColXpath;
				WebElement element = driver.findElement(By.xpath(actualXpath));
				System.out.println(element.getText());
				
				if(element.getText().equals("Country")){
					System.out.println("The column "+ element.getText()+ " is present at " +i +" position");
					
				}
				
				
				
			}
			System.out.println("***************************************");
			driver.quit();
	}
			
/*	lets find a pattern in the webtable row xpaths found using chrome f12
 Pattern found is  "//*[@id="customers"]/tbody/tr[" and "/th[1]" are common in all rows.
 		//*[@id="customers"]/tbody/tr[1]/th[1]
 		//*[@id="customers"]/tbody/tr[2]/th[1]
		//*[@id="customers"]/tbody/tr[3]/th[1]
		//*[@id="customers"]/tbody/tr[4]/th[1]
		//*[@id="customers"]/tbody/tr[5]/th[1]
		//*[@id="customers"]/tbody/tr[6]/th[1]
		//*[@id="customers"]/tbody/tr[7]/th[1]
		
		
		//*[@id="customers"]/tbody/tr[1]/th[2]
		//*[@id="customers"]/tbody/tr[4]/td[2]
		 */
		
			

	}


