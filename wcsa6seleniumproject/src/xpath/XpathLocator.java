package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-gq18f8q/login.do");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("/a[@id='loginButton']")).click();
		Thread.sleep(2000);
		driver.quit();		
	}

}