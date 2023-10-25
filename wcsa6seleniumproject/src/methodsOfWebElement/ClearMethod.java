package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("http://desktop-gq18f8q/login.do");
	// identify username text box and pass the invalid inputs 
	driver.findElement(By.name("username")).sendKeys("admin123");
	
			//identify passwod text box and pass the valid inputs
	WebElement passwordTextBox = driver.findElement(By.name("pwd"));
		passwordTextBox.sendKeys("manager");
	// identify login button and click 
		WebElement loginButton = driver.findElement(By.id("loginButton"));
			
		loginButton.click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			WebElement usnTB = driver.findElement(By.name("username"));
			usnTB.sendKeys("admin");
			Thread.sleep(2000);
		WebElement pwdTB = driver.findElement(By.name("pwd"));
		pwdTB.sendKeys("manager");
		Thread.sleep(2000);
	     usnTB.clear();
	      pwdTB.clear();
	      
	
			
			
		
			
	}

}
