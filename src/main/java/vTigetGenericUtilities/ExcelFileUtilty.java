package vTigetGenericUtilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

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
public class ExcelFileUtilty {
	private Workbook wb;
	/**
	 * 
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String ReadDataFromExcelSheet(String sheetname,int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis= new FileInputStream(AutoConstant.ExcelFilepath);
		Workbook wb = WorkbookFactory.create(fis);
		return wb.getSheet("organisation").getRow(1).getCell(1).getStringCellValue();
		
}
/**
 * 
 * @param Sheetname
 * @return
 * @throws EncryptedDocumentException
 * @throws IOException
 */

     public Object[][] readMuttpleDataFromExcel(String Sheetname) throws EncryptedDocumentException, IOException
     {
    	 FileInputStream fis= new  FileInputStream(AutoConstant.ExcelFilepath);
    	 
    	    	
 		   Workbook wb= WorkbookFactory.create(fis);
 		Sheet sh = wb.getSheet(Sheetname);
 		int lastrow = sh.getLastRowNum();
 		int lastcell = sh.getRow(0).getLastCellNum();
 		Object [][]data= new Object [lastrow][lastcell];
 		 for(int i=0;i<lastrow ;i++)
 		 {
 			 for(int j=0;j<lastcell;j++)
 			 {
 				 data[i][j]=sh.getRow(i+1).getCell(j).getStringCellValue();
 			 }
 		 }
 		
 		return data;
 		
 		
     }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
