package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-gq18f8q/login.do");
   Thread.sleep(2000);
   driver.findElement(By.id("login Button")).click();
   
		} 
}
