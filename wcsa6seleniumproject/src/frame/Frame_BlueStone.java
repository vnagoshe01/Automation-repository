package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_BlueStone {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		//handle hidden divsion popup
		driver.findElement(By.id("denyBtn")).click();
		
		//this chat box is design under th frame
		//handle frame first
		//driver.switchTo().frame(3);//.....we handled frame by using index 
		//driver.switchTo().frame("fc_widget");//we handled frame by using id or name
		
	WebElement frameElement = driver.findElement(By.id("fc_widget"));
	driver.switchTo().frame(frameElement);
	
	
		//identify chatbox
            WebElement chatBox = driver.findElement(By.id("chat-icon"));
           		chatBox.click();
		//Thread.sleep(4000);
		    //switch controls to parent page
				driver.switchTo().parentFrame();
				
		driver.findElement(By.id("chat-fc-name")).sendKeys("vsn");
		driver.findElement(By.id("chat-fc-email")).sendKeys("vsn@gmail.com");
				driver.findElement(By.id("chat-fc-phone")).sendKeys("9545491670");
				
				
				
			
		
}
}