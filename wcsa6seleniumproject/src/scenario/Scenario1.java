package scenario;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenario1 {
	public static void main(String[] args) {
		WebDriver	 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.bluestone.com/");
		//handle hidden divsion popup
		
		// handle hidden division pop up
		driver.findElement(By.id("denyBtn")).click();
		
		
				
				
				
}
}
