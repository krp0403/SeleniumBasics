package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertTypes {
SoftAssert SoftAssert = new SoftAssert(); // initializing a variable of the type soft assert.

@Test
public void TestAsset(){
	
	System.out.println("In Test Assert test code");
	
	System.out.println("On some page");
	System.out.println("After hard assert");
	
	SoftAssert.assertEquals(true, false);
	System.out.println("After soft assert");
	
	//Assert.assertEquals(true, false); //this is hard assert and we do not need to initialize hard assert explicitly.
	
	//SoftAssert.assertAll(); // .AssertAll() is a function that will check for all the soft assert failures in the test set. 
	// there are 3 ways to mention the assertAll() function. 
	// 1. In the teardown function: But if you mention the assertAll function in tearDown function then that function will fail rather than the test cases.
	//2.  mentioning at the end of the test set before teardow().
	// 3. individually in each test case to get to the root of failing test case easily but it is a repeatitive task. 
}

}
