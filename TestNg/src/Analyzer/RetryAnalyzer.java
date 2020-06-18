package Analyzer;

// This is not through. Needs more attention and revisiting concepts.


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
//The custom class retryanalyzer implements the functions of the selenium interface IRetryAnalyzer.
	
	int counter = 0;
	int retrycount =3;
	
	public boolean retry(ITestResult Result){
		 if(counter<retrycount){
			 counter++;
			 return true;

		 }
		 
		 return false;
		 }
	}


