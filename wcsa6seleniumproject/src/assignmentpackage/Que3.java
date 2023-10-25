package assignmentpackage;

import java.time.Duration;

//import javax.swing.JSeparat

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3 {
	// How to close only parent Browser
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.get("http://omayo.blogspot.com/");
			
			
			
			Thread.sleep(3000);
			// scroll till open a popup window link
			driver.findElement(By.partialLinkText("Open a popup window"));
			
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			Object childBrowser;
			jse.executeScript("arguments[0].scrollIntoView(true)", childBrowser);
			
			//jse.executeScript("arguments[0].scrollIntoView(true)",childBrowser);
			
			
				// click on link
			childBrowser.click();
			
			Thread.sleep(3000);
			
			// to close only parent browser use close();
			
			driver.close();

}
}