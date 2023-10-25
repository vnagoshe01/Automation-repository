package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AirVistara {
	public static void main(String[] args) throws InterruptedException {
		
     FirefoxOptions fo=new FirefoxOptions();
	fo.addArguments("--disable-notifications");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.airvistara.com/in/en");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//Button[text('x']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City' and (@name='flightSearchForm')]")).sendKeys("pune",Keys.ENTER);
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='flightSearchTo']")).sendKeys("kochi",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='depart']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='month col-xs-2 col-sm-2 col-md-3 mon-jul active']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("31")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@monthname,'Aug')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("14")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passengers']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'col-xs-12 done_btn')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
