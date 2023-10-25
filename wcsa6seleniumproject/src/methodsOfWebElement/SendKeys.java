package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver	driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://desktop-gq18f8q/login.do");
		driver.findElement(By.name("username")).clear();
		WebElement usnTB = driver.findElement(By.name("username"));
		usnTB.sendKeys("admin");
		Thread.sleep(2000);
	WebElement pwdTB = driver.findElement(By.name("pwd"));
	pwdTB.sendKeys("manager");
	Thread.sleep(2000);
	WebElement loginButton = driver.findElement(By.id("loginButton"));
     //usnTB.clear();
      //pwdTB.clear();
}
}