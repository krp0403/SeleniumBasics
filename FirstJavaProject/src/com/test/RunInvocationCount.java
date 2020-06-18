package com.test;

import org.testng.annotations.Test;

public class RunInvocationCount {
	
	@Test(invocationCount=10)
	public void RunTest(){
		
		
		System.out.println("Running the invocation test ");
		
		
	}

}
