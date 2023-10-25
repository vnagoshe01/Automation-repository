package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handled_Web_Element {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/Dhanshri/Desktop/disableWebelemnt/disableElement.html");
	//identify username
	driver.findElement(By.id("id1")).sendKeys("vsn");
	Thread.sleep(5000);
JavascriptExecutor jse = (JavascriptExecutor)driver;
jse.executeScript("document.getElementById('id2').value='vsn@12';");

	
	}

}
