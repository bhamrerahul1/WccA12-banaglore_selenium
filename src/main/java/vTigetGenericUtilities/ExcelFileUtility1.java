package vTigetGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class consist of generic methods related to read data from  Excel sheet
 * @author Admin
 *
 */
public class ExcelFileUtility1

{
	/**
	 * This class consist of generic methods related to read data from  Excel sheet
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String ReadDataFromExcelSheet1(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(AutoConstant.ExcelFilepath);
		Workbook wb = WorkbookFactory.create(fis);
	String value = wb.getSheet("organisation").getRow(1).getCell(1).getStringCellValue();
	wb.close();
	  return value;
	  
		
}
	/**
	 * 
	 * @param sheetname
	 * @param rowno
	 * @param cellno
	 * @param value
	 * @throws IOException
	 */
     
	
	
	public void WriteDataIntoExcelSheeet(String sheetname,int rowno,int cellno,String value) throws IOException
	{
		FileInputStream fis= new FileInputStream(AutoConstant.ExcelFilepath);
		Workbook wb = WorkbookFactory.create(fis);
		    Sheet sh = wb.createSheet(sheetname);
		   Row row = sh.createRow(rowno);
		      
		      Cell cell = row.createCell(cellno);
		     cell.setCellValue(value);
		     FileOutputStream fout= new  FileOutputStream(AutoConstant.ExcelFilepath);
		    wb.write(fout);
		    wb.close();
		     
	}

}
