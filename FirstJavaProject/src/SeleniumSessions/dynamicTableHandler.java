//#### This program is about reading the dynamic web tables on the web pages.

package SeleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utility.Xls_Reader;

public class dynamicTableHandler {

		public static void main(String[] args) throws InterruptedException {
// #### Initializer
			System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();	
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
			
			driver.get("http://demo.guru99.com/test/web-table-element.php#");
//### getting the xpaths and total row count from web page for the table under test
			
			String BeforeXpath = "//*[@id='leftcontainer']/table/tbody/tr[";// break the xpath pattern.
			String AfterXpath = "]/td[1]";// break the xpath pattern.
			
			String BeforeXpath_CP = "//*[@id='leftcontainer']/table/tbody/tr[";// break the xpath pattern.
			String AfterXpath_CP = "]/td[4]";// break the xpath pattern.
		
			List<WebElement> rows = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
			int rowCount = rows.size();// get total number of rows
			System.out.println("The total number of rows is " + rows.size());
			
			Xls_Reader reader = new Xls_Reader("C:\\Users\\dell\\workspace\\FirstJavaProject\\src\\SeleniumSessions\\Testdata1.xlsx");
			reader.addSheet("TestData");
			reader.addColumn("TestData", "CompayName");
			reader.addColumn("TestData", "CurrentPrice");
	
			for (int i=2; i <= rowCount; i++){
//				now lets print values from the table using the simple for loop.
				String actualXpath_company =  BeforeXpath+i+AfterXpath;
				String CompayName = driver.findElement(By.xpath(actualXpath_company)).getText();
				reader.setCellData("TestData", "CompayName", i, CompayName);
				//System.out.println(CompayName);
				
				//String web = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[4]")).getText();
				String ActualXpath_CP = BeforeXpath_CP+i+AfterXpath_CP;
				String Web = driver.findElement(By.xpath(ActualXpath_CP)).getText();
				System.out.println(Web);
				reader.setCellData("TestData", "Current_Price", i, Web);			
//				
//				
//				
				
//Now lets try and get the current price for a particular entity and break the loop when the entity is found on the list.
//				if(CompayName.contains("ICICI Pru Life")){
//					//
//					//String Name = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[1]")).getText();
//					System.out.println("The current value of " + CompayName + " is " + web);
//				break;
//				}
//				else  if(CompayName.contains("IDFC L")){
//					//String web = driver.findElement(By.xpath("//*[@id='leftcontainer']o/table/tbody/tr["+ i +"]/td[4]")).getText();
//					//String Name = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[1]")).getText();
//					System.out.println("The current value of " + CompayName + " is " + web);
//					break;
//				}
//				else if(CompayName.contains("Colgate Palm.")){
//					//String web = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[4]")).getText();
//					//String Name = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[1]")).getText();
//					System.out.println("The current value of " + CompayName + " is " + web);
//					break;
//				}					
//
//				else if(CompayName.contains("Capital First")){
//					//String web = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[4]")).getText();
//					//String Name = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+ i +"]/td[1]")).getText();
//					System.out.println("The current value of " + CompayName + " is " + web);
//					break; 
//					}
//			
//				while (i<=rowCount){
//					
//					reader.setCellData("TestData", "CompayName", i, CompayName);
//					reader.setCellData("TestData", "Current_Price", i, web);
//			
//				}	
			}
			//driver.quit();	
}
		

}
