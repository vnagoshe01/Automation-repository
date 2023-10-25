package dropDownHandling;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IsMultipleMethod {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		      // use to launch single select dropdown
		
		 // use to launch multi select select dropdown
		 driver.get("file:///C:/Users/Dhanshri/Desktop/Web%20Element/multipledropdown.html");
		
		WebElement dropDownElement = driver.findElement(By.name("menu"));
	     
	 	Select sel = new Select(dropDownElement);
	 	
	 	// to check whether the dropdown is single select or multi select
	 	System.out.println(sel.isMultiple()); // for single select : false
	 	                                     //for multi select : true
	 
		
	
	}
	

}
