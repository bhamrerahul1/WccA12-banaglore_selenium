package vTigerPratice;

import org.testng.annotations.Test;

public class DebuggingPratice {
	
	
	
	@Test
	public void test()
	{
		System.out.println("this is main");
		System.out.println("div is called");
		System.out.println("div is called");
		
		System.out.println("div is called");
		System.out.println("div is called");
		System.out.println("div is called");
		int c = div(10,5);
		System.out.println(c);
		System.out.println("division is performed");
	}
	public static int div(int a,int b)
	{
		int c=a/b;
		return c;
		
	}
	
	
	

}
