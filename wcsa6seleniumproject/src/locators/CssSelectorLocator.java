package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {
	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver	=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("http://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label='username']")).sendKeys("vnagoshe01gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[aria-label^=' p']")).sendKeys("Vishu@98",Keys.ENTER);
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("button[type$='\t']")).click();
		
		
		
	}

}
