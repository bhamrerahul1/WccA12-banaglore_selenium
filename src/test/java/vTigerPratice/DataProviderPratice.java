package vTigerPratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderPratice {

	@Test(dataProvider="getData")
	public void sampleTestData (String Phonename,int price)
	{
        System.out.println(Phonename+"....>>>>>>="+price);
	}
	@DataProvider
	public Object [][] getData()
	{                                //rows//cell
		Object [][]data= new Object [3][2];
		data[0][0]="SAMSUNG";
		data[0][1]=	8000	;
		
		data[1][0]="Iphone";
	    data[1][1]=   5000;
		data[2][0]	="Nokia";	
	   data[2][1]=     15000;
	return data;
	
	

		
	}
}