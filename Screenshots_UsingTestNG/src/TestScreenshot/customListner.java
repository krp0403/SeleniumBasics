package TestScreenshot;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class customListner extends base implements ITestListener {
// this customlistner class extends base class and implements the testng interface called ITestListner.
// on initilazing the class we have to implement the interface's unimplemented functions. Rather say override them. 
// so here we will only override the onTestFailure function from the ITestListener. 
// other unimplemented function skeletons are auto loaded. when we select to implement them. 
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		System.out.println("The test has failed");
		failed(result.getMethod().getMethodName());
		//this will invoke the failed() function have the result instance variable to get the method and methodname using "TestMethodName" variable declared in base class.
		// this will use the result variable to get the method and the method name and use it to create the screenshot file.
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
