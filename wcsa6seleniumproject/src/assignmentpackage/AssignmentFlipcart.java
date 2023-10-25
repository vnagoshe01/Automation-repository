package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentFlipcart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//search laptop
		driver.findElement(By.name("q")).sendKeys("Laptops");
		Thread.sleep(2000);
		//handle to popup
		driver.findElement(By.xpath("//button[text()='X']")).click();
				//search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(2000);
		//click on core i5
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Core i5']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		Thread.sleep(2000);
		//click on HP
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='HP']")).click();
		Thread.sleep(2000);
		//click on oprating system
		driver.findElement(By.xpath("//div[text()='Operating System']")).click();
		Thread.sleep(2000);
		//click on windows 11
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='Windows 10']")).click();
		Thread.sleep(2000);
		//click on rating
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[text()='4★ & above']")).click();
		Thread.sleep(2000);
		//identify all the suggestions of laptop
	 // WebElement allsuggestions = driver.findElement(By.xpath("//div[@class='_4rR01T']"));
	  //use looping statement
	 // for(int i=0;< allsuggestions.size();i++)
	  
	//  {
		  
		  
	//nameofLaptop = allsuggestions.get(i).getText();
		  
		  
		  
	 // }
		  
		
		
		
		
	}

}
