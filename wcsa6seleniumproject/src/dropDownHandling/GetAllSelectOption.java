package dropDownHandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectOption {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		      // use to launch Multi select dropdown
		driver.get("file:///C:/Users/Dhanshri/Desktop/Web%20Element/multipledropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.name("menu"));
		Select sel = new Select(dropDownElement);
	
		
		// select the options from dropDown
		for(int i=0;i<4;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		
		Thread.sleep(5000);
		//  to read the options that are selected
		List<WebElement> allOtps = sel.getAllSelectedOptions();
		
		// print the options that are selected
		
			for(WebElement opt:allOtps){
				
			
		
			Thread.sleep(2000);
			System.out.println(opt.getText());
			
			}
		
	}

}
