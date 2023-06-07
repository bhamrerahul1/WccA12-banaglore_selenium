package vTigerPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryAnalyserPratice  {
	
      @Test(retryAnalyzer=vTigetGenericUtilities.RetryAnalyserImplmentationClass.class)
		
		public void retryanapratice()
		{
	//	Assert.fail();
		System.out.println("hellooo");
		}

}
