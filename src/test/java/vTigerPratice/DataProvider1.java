package vTigerPratice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

	
	
	
	@Test(dataProvider="getData")
	public void sampleTestData (String Phonename,int price,int size)
	{
        System.out.println(Phonename+"....>>>>>>="+price+"......"+size);
	}
	@DataProvider
	public Object [][] getData()
	{
		Object [][]data= new Object [5][3];
		data[0][0]="Fastrackwatch";
		data[0][1]= 1800;
	    data[0][2]=	32	;
	    data[1][0]="nikeshoes";
		data[1][1]= 5000;
	    data[1][2]=	7	;
	    data[2][0]="Lenskart";
		data[2][1]= 2000;
	    data[2][2]=	12	;
	    data[3][0]="SparkSandle";
		data[3][1]= 1000;
	    data[3][2]=	10	;
	    data[4][0]="gucci";
		data[4][1]= 1800;
	    data[4][2]=	32	;
	   
	   return data;
	
}
}
