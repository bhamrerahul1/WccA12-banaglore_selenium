package vTigerPratice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgPratice {

	@Test()
	public void createUser()
	{
	//	Assert.fail();
		System.out.println("userCreated sucessfully");
		

	}

	@Test(dependsOnMethods="createUser")
	public void userModifed()
	{
		System.out.println("userModifed is sucesffully");
		

	}
	@Test(enabled=false)
	public void deleteUser()
	{
		System.out.println("deleteUser is sucessfully");
		

	}
	
	
}
