package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath6Dependent {
	public static void main(String[] args) {
		//WebDriver driver =new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://flipcart.com");
		//handle hidden devision pop up
		driver.findElement(By.xpath("//button[text()='x']")).click();
		//identify search box
		driver.findElement(By.name("q")).sendKeys("Mobiles");
		//identify search icon and click
		driver.findElement(By.xpath("/button[@class='Loz3Pu']")).click();
		//System.out.println(driver.findElement(By.xpath("//button[contains(arial,'Se')]"))).click();
		WebElement priceElement = driver.findElement(By.xpath("//div[text()='OPPO Reno10 Pro 5G (Silvery Grey, 256 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']"));
		
		//div[text()='OPPO Reno10 Pro 5G (Silvery Grey, 256 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='col col-7-12']/following-sibling::div[@class='col col-5-12 nlI3QM']/descendant::div[@class='_30jeq3 _1_WHN1']
		
		
		
	}

}
