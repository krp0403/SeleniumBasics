package TestScreenshot;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(customListner.class) 
// by this statement we make the program refer to the customelistner class we have created see the project tree.
public class ScreenShotTest extends base {
// we have extended the base class so as to be able to use the functions from that class.
	
	@BeforeMethod
	public void initialize(){
		initialization(); // this is the function defined in the base class (file) and called here 
		System.out.println("Initialize Tests");
	}
	{
		
	}
	
	@Test
	public void LaunchBrowser(){
	
		System.out.println("Launch browser");
		Assert.assertEquals(true, false); 
		// trying to deliberately fail the test to invoke screenshot taking function.
		// when the test case fails the listener  refers to the failed() function defined in base class and invokes the implemented screenshot function. 
		
	}
	
	@Test
	public void launchurl(){
		
		System.out.println("Launch url");
	}

	@Test
	public void login(){
		System.out.println("enter username");
		System.out.println("enter password");
		Assert.assertEquals(true, false); 
		// trying to deliberately fail the test to invoke screenshot taking function.
		// when the test case fails the listener  refers to the failed() function defined in base class and invokes the implemented screenshot function. 
		// this should create separate screenshot with the method name.
	}

	@Test
	public void homepage(){
		System.out.println("on homepage");
		Assert.assertEquals(true, false); 
	
		// trying to deliberately fail the test to invoke screenshot taking function.
		// when the test case fails the listener  refers to the failed() function defined in base class and invokes the implemented screenshot function. 
		// this should create separate screenshot with the method name.
	}
	
	
	@AfterMethod
	public void Teardown(){
		System.out.println("close browser");
		driver.quit();
		
	}

}
