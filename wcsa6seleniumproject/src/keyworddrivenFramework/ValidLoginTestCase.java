package keyworddrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLoginTestCase extends BaseTest implements IautoConstant{




public static void main(String[] args) throws IOException, InterruptedException {
	//to open &close  the browser
	
	BaseTest bt = new BaseTest();
	bt.openBrowser();
	//to read the valid username and password3
	Flib flib = new Flib();
	
	//identify password text box and pass password
	driver.findElement(By.name("username")).sendKeys(flib.readPropertyData(PROP_PATH,"Username"));
	//identify password textboxd pass password
	driver.findElement(By.name("pwd")).sendKeys(flib.readPropertyData(PROP_PATH,"Password"));
	//identify loginButton and click

	driver.findElement(By.id("loginButton")).click();
	Thread.sleep(2000);
	bt.closeBrowser();
	
}
}


		