package vTigetGenericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * This class is an implementation of IRetryAnalyser interface of testng
 * @author Admin
 *
 */
public class RetryAnalyserImplmentationClass implements IRetryAnalyzer  {

	int count=0;
	int retrycount=3;
	public boolean retry(ITestResult result) {
		
		
		while( count<retrycount)
		{
			count++;
			return true;
		}
		
		
		return false;
	}
	

	

}
