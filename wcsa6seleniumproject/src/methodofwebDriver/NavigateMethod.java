package methodofwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver  driver= new ChromeDriver();
	driver.manage().window().maximize();
	//use navigste method and launch the web application
	driver.navigate().to("https://www.goggle.com");
	//use navigate  perform backword operation
	Thread.sleep(2000);
	driver.navigate().back();
	
	//use the navigate perform backward opration
	driver.navigate().forward();
	
	driver.close();
	
	}

}
