package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.xpath("//a[contains(@href,'#')and (text()='create new account')]")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("firstname")).sendKeys("vishakha");
	Thread.sleep(2000);
	driver.findElement(By.name("lastname")).sendKeys("nagoshe");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email__")).sendKeys("vangoshe01@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("vnagoshe01@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("reg_passwd__")).sendKeys("vedu@123");
	Thread.sleep(2000);
	driver.findElement(By.name("birthday_day")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[text()='03']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@aria-lable='Month']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//optuon[text()='May']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//select[@aria-lable='Year']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//option[text()='1998']")).click();
	Thread.sleep(2000);
	
}
}
