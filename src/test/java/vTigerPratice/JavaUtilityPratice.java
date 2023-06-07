package vTigerPratice;

import java.io.IOException;

import vTigetGenericUtilities.ExcelFileUtility1;
import vTigetGenericUtilities.ExcelFileUtilty;
import vTigetGenericUtilities.JavaUtility;
import vTigetGenericUtilities.PropertyFileUtility;

public class JavaUtilityPratice {

	public static void main(String[] args) throws IOException {
		
		
		JavaUtility js= new  JavaUtility();
		     int randomvalue = js.getRandomNumber();
		     System.out.println(randomvalue);
		     String systemdate = js.getSystemDate();
		     System.out.println( systemdate);
		    String SystemdateinFormat = js.getSystemDateinFormat();
		    System.out.println(SystemdateinFormat);
		    PropertyFileUtility pfile= new PropertyFileUtility();
		  String value = pfile.ReadDataFromProperyFile("url");
		  System.out.println(value);
		  ExcelFileUtilty excel= new ExcelFileUtilty();
		/*  String exceldatafetch = excel.ReadDataFromExcelSheet("organisation", 1, 2);
		  System.out.println(exceldatafetch);*/
		  ExcelFileUtility1 exc1= new ExcelFileUtility1();
		  String excel1 = exc1.ReadDataFromExcelSheet1("organisation", 1, 2);
		  System.out.println(excel1);
	exc1.WriteDataIntoExcelSheeet("ce", 10, 12, "data is added");
	 System.out.println("read data add sucessfully");
	  
		  
		  
		  
		  
		  
		    
		    
		     
		 

	}

}
