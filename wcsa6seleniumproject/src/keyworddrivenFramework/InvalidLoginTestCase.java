package keyworddrivenFramework;

import java.io.IOException;

//import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;

public class InvalidLoginTestCase extends BaseTest implements IautoConstant {
	public static void main(String[] args) throws IOException, InterruptedException {
		//to open &close browser
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		//Read the invalid username & password from ActiTimeTestData Excel file
		Flib flib = new Flib();
		//get the last row count 
	int rc = flib.getLasrRowCount(EXCEL_PATH,INVALID_SHEETNAME);
	Thread.sleep(4000);
	
		for(int i=1;i<=rc ;i++) {
			try {
			// identify username text box pass invalid username
			driver.findElement(By.name("username")).sendKeys(flib.readExcelData(EXCEL_PATH,INVALID_SHEETNAME , i, 0));
			//identify password text box pass invalid password
			driver.findElement(By.name("pwd")).sendKeys(flib.readExcelData(EXCEL_PATH,INVALID_SHEETNAME, i, 1));
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			//identify login Button and click
			Thread.sleep(4000);

           driver.findElement(By.id("loginButton")).click();
           //for refreshpage ......staleElementRefrenceException
           driver.navigate().refresh();	
         //clear the username text Box
   		driver.findElement(By.name("username")).clear();
   	//clear the username text Box
   		driver.findElement(By.name("pwd")).clear();
		}
   	
	
		Thread.sleep(4000);
		bt.closeBrowser();
		
	}

	

	
	

}
