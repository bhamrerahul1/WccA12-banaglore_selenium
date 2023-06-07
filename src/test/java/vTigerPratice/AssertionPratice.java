package vTigerPratice;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionPratice {

	SoftAssert sa= new SoftAssert();
	
	
	@Test
	public void AssertionsPratice()
	{
		System.out.println("step01..................");
		System.out.println("step02..................");
		sa.assertEquals("hi" ,"hi ");//passed
		sa.assertEquals(1,0);//failure
		 sa.assertTrue(false);
		
		System.out.println("step03..................");
		System.out.println("step04..................");
		sa.assertAll();// log all the asserations failure
			
		
	}
	@Test
	public void Pratice()
	{
		System.out.println("second step step01..................");
		System.out.println("second step step02..................");
	}
	
	
}
