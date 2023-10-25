package assignmentpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AssignmentONRobotandActions {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.bluestone.com/");
		//identify the getting started webelement
				WebElement gettingStarted = driver.findElement(By.xpath("//h2[text()='Getting Started']"));
		//driver.findElement(By.id("denyBtn")).click();
	//	driver.findElement(By.xpath("//a[text()='Watch Jewellery ']"));
		 Actions act = new Actions(driver);
		
		//perform mouseHover on gettingStarted
		act.moveToElement(gettingStarted).perform();	
		//perform Right click
				act.contextClick(gettingStarted).perform();

			
			
		// WebElement watchJewellery;
		//act.moveToElement(watchJewellery).perform();
			
		
				//pass the controls to inspect Option

				// create obj for Robot Class
				Robot robot = new Robot();
				
		 
		
		
				for(int i=0;i<=10;i++)
				{
				   Thread.sleep(2000);
		           robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		           robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		         
				}
				
				Thread.sleep(2000);
				// press the enter key
				robot.keyPress(KeyEvent.VK_ENTER);
				robot.keyRelease(KeyEvent.VK_ENTER);		
		
		
		
	}
}
