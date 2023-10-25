package javaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Hidden_WebElement {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.selenium.dev");
	//click on read more button of selenium grid
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@class='selenium-button selenium-grid text-uppercase fw-bold']"));
	
	
	}

}
