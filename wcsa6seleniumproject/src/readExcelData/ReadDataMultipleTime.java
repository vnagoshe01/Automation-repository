package readExcelData;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataMultipleTime {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		for(int i =1;i<=7;i++)
		{
		//read the data/values from IPL sheet
		FileInputStream fis = new FileInputStream("./data/TestData.xlsx");
	
	Workbook wb = WorkbookFactory.create(fis);//make the file ready to read
	Sheet sheet = wb.getSheet("IPL");//provide sheet name
	Row row = sheet.getRow(i);//get into the desired row
	Cell cell = row.getCell(0);//get into the desired column
	String data = cell.getStringCellValue();//it will read the value
	System.out.println(data);
		}
}
}