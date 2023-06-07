package vTigerPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import vTigetGenericUtilities.AutoConstant;

public class PropertyFilePratice {

	public static void main(String[] args) throws IOException {
	
		FileInputStream fis= new FileInputStream(AutoConstant.ExcelFilepath);
		Properties p= new 	Properties();
		p.load(fis);
		String BROWSER = p.getProperty("browser");
		 System.out.println(BROWSER );
		 String URL = p.getProperty("url");
		 System.out.println(URL);
		 
		
		 
		
		
		

	}

}
