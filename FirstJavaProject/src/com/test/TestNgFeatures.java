package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNgFeatures {

	//lets learn about the testng.xml file. This is created through project\right click\others\file\tetng.xml
	// the xml file is used to run all the classes in the package in a batch. Open the testng.xml file and observe the file structure.

	//### feature: Handling the expected exceptions in testNg. At times while we create test code we expect few exceptions. Lets see how to handle them.

	@Test(expectedExceptions=NumberFormatException.class)
	public void TryExpectedException(){
		String x= "100A";
		Integer.parseInt(x);
		//here we are expecting a number format exception and we are telling testng in the initiation that if this exception comes.
		// do not fail the test case.
	}


	//	### Feature: invocationTimeOut.  This function is used to break the test execution in case it gets stuck / runs into infinite loop.
	// Lets see how. 
	// providing a timeout of 2 milliseconds. So that if the test case continues to execute beyond 2 miliseconds.
	//it will be terminated with an error. lets see.
	//jaJavadoc (documentation) says : 
	//The maximum number of milliseconds that the total number of invocations on this test method should take. 
	//This annotation will be ignored if the attribute invocationCount is not specified on this method. 
	//If it hasn't returned after this time, it will be marked as a FAIL.

	//so it should give below exception in the output file (index.html)
	//	org.testng.internal.thread.ThreadTimeoutException: Method org.testng.internal.TestNGMethod.invocationTimeOut()
	//	didn't finish within the time-out 2
	//	at com.test.TestNgFeatures.invocationTimeOut(TestNgFeatures.java:21)

	@Test( invocationCount=2,invocationTimeOut=2) 
	public void invocationTimeOut(){
		int i =1;
		while(i== 1){
			System.out.println("Inside infinite looop");
			// here we are initiating a while loop but will not increment counter for i. Making it an infinite loop.
		}


	}

	//(Invocationcout=10) makes the test run 10 times. lets see

	@Test(invocationCount=10)// makes the invocation test  run 10 times.
	public void Invocationtest(){
		for (int i=1; i<10;i++){		
			System.out.println("Running Invocation Test #" + i);

		}
	}

	//lets see the 'dependsOnMethods' function. This is used when test case b is dependent on test case a. So if a has failed then b will not be executed.
	// Syntax: @Test(Depends

	@Test
	public void logintest(){
		System.out.println("Login Test");
	}

	@Test(dependsOnMethods="logintest")
	public void homepageTest(){
		System.out.println("homepage Test");
	}

	@Test
	public void homepageSection1(){
		System.out.println("On Homepage Section 1");
		int i = 9/0;
		//		 here we are trying to make this test fail so that we can see that the dependent test cases will be skipped.
		//		 so below two tests are skipped since homesection1 is failing and below 2 are dependent on homesection1
	}

	@Test(dependsOnMethods="homepageSection1")
	public void homepageSection2(){
		System.out.println("On Homepage Section 2");
	}

	@Test(dependsOnMethods="homepageSection1")
	public void homepageSection3(){
		System.out.println("On Homepage Section 3");
	}



}
