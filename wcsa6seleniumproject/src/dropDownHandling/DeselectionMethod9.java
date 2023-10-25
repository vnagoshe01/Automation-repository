package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeselectionMethod9 {
	public static void main(String[] args) throws InterruptedException {
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 		 	driver.get("https://demoapps/qspiders.com");
	 		 //	identify dropdown  options 
	 		 
}
}