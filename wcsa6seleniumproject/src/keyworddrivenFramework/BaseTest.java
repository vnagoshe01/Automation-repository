package keyworddrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest extends Flib implements IautoConstant {
	static WebDriver driver;
	public void openBrowser() throws IOException{
		//read the data from property file to get the BrowserValue and url
		Flib flib = new Flib();
		String browservalue = flib.readPropertyData("./data/config.properties", "Browser");
		String url = flib.readPropertyData("./data/config.properties", "Url");
		System.out.println(url);
		if(browservalue.equalsIgnoreCase("Chrome"))
		{
		driver	=new ChromeDriver();
				}
		else if (browservalue.equalsIgnoreCase("Edge")) {
			driver	=new EdgeDriver();
					}
		
		else if (browservalue.equalsIgnoreCase("firefox")) {
			driver	=new FirefoxDriver();
					
		}
		else {
			System.out.println("enter the valid browser value!!");
			
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(url);
		
	
}
	public void closeBrowser() {
		
		driver.quit();
		
	}
}