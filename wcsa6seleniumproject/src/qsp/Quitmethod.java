package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quitmethod {
	//it is use to close parent and child browser
public static void main(String[] args) throws InterruptedException {
	
	//parent browser
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	//launch the web application
	//driver.get("http://amayo.blogspot.com/");
	Thread.sleep(2000);
	//launch child browser
	driver.findElement(By.xpath("//a(text()='open a pop up window')")).click();
	
	Thread.sleep(2000);
	
	//use the close method
	driver.close();
	driver.quit();
	
}
}
