package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextLocator {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://omayo.bloqspot.com/");
	Thread.sleep(2000);
	driver.findElement(By.linkText("open a popup window")).click();
	driver.close();
	
	
}
}
