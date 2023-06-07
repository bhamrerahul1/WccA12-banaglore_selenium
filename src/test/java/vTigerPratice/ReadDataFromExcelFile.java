 package vTigerPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import vTigetGenericUtilities.AutoConstant;

public class ReadDataFromExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(AutoConstant.ExcelFilepath);
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sh = wb.getSheet("organisation");
	        Row row = sh.getRow(1);
	       Cell cells = row.getCell(2);
	    String actualvalue = cells.getStringCellValue();
	    System.out.println(actualvalue);
	    wb.close();
	       
	        
	
		
	}

}
