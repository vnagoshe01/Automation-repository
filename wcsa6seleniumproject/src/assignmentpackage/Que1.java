package assignmentpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que1 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https//:omayo.blogspot.com/");
	Thread.sleep(3000);
	
	// scroll till open a popup window link
	WebElement childBrowser = driver.findElement(By.partialLinkText("Open a popup window"));
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	//jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
	//
	//jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
	jse.executeScript("arguments[0].scrollIntoView(false)",childBrowser);
	//jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
	
	
	
	
	// click on link
	childBrowser.click();
	
	Thread.sleep(3000);
	
	// to close ALL browsers use quite()
	driver.quit();
	
	}
	

}
