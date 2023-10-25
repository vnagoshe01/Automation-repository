package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_GoggleMap {
public static void main(String[] args) {
WebDriver	driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
//click on goggle maps
//driver.switchTo().frame("app");
//click on map
//driver.findElement(By.xpath("//span[text()='Maps']")).click();


driver.switchTo().frame("app");

//click on maps
driver.findElement(By.xpath("//span[text()='Maps']")).click();	
	
}
}
