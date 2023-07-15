package genericPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Flib {
	
	public String readExceldata(String excelPath,String sheetname,int rowCount,int cellCount) throws EncryptedDocumentException, IOException
{
	   FileInputStream fis = new FileInputStream(excelPath);
	     Workbook wb = WorkbookFactory.create(fis);
	         Sheet sheet = wb.getSheet(sheetname);
	       Row row = sheet.getRow(rowCount);
	       
	          Cell cell = row.getCell(cellCount);
	          String data = cell.getStringCellValue();
	          return data;
}
	public String readPropertyData(String propPath,String key) throws IOException
	{
		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String data=prop.getProperty(key);
		return data;
		
	}
	public int rowCount(String excelPath,String sheetname) throws EncryptedDocumentException, IOException
	{
		   FileInputStream fis = new FileInputStream(excelPath);
		   Workbook fb = WorkbookFactory.create(fis);
		     Sheet sheet = fb.getSheet(sheetname);
		     int rc = sheet.getLastRowNum();
		     return rc;
	}
	
	 public void writeExcelData(String excelPath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	 {
		 FileInputStream fis = new FileInputStream(excelPath);
		  Workbook fb = WorkbookFactory.create(fis);
		  Sheet sheet = fb.getSheet(sheetname);
		   Row row = sheet.getRow(cellcount);
		    Cell cell = row.getCell(cellcount);
		    cell.setCellValue(data);
		   FileOutputStream fo = new FileOutputStream(excelPath);
		   fb.write(fo);
	 }
}


