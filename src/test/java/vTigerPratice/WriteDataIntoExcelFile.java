package vTigerPratice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis= new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("contacts");
		       Row rw = sh.createRow(13);
		         Cell cell = rw.createCell(9);
		        cell.setCellValue("rahuls");
		        FileOutputStream fos= new FileOutputStream(".\\src\\test\\resources\\TestData.xlsx");
		     wb.write(fos);
		     wb.close();
		     System.out.println("sucessfully you have completed your task");
		     
		         
		          
		      
		      
		        
		        
		          
		

	}

}
