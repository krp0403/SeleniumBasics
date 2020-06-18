package MyTests;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test1{

	
	@Test(retryAnalyzer= Analyzer.RetryAnalyzer.class)
	public void Test2()
	{
		System.out.println("In test2 method");
		Assert.assertEquals(true, false);
		
	}
	
	
	@Test (retryAnalyzer= Analyzer.RetryAnalyzer.class)
	public void Test3()
	{
		System.out.println("in test3 method"); 
		Assert.assertEquals(true, false);
	}
}
