package assignmentpackage;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SpiceJet {
 public static void main(String[] args) throws InterruptedException {
	 //Handle notification popup
	// ChromeOptions co = new ChromeOptions();
	FirefoxOptions ff = new FirefoxOptions();
       ff.addArguments("--disable-notifications");
        
	//WebDriver driver= new ChromeDriver();
	WebDriver driver=new FirefoxDriver();
	
	
	driver.manage().window().maximize();
	driver.get("https://www.spicejet.com/");
	Thread.sleep(2000);
	
	
}
}																																																																																																																																																																																																																																																																																																																																																																			
