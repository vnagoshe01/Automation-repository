package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class actitimeModule {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://desktop-gq18f8q/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("manager");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@id='loginButton']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/Body[@class='exe-firefox]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("/Bode"));
	
	
	}
}
