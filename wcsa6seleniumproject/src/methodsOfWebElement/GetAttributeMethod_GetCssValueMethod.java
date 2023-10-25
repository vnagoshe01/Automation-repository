package methodsOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod_GetCssValueMethod {
	public static void main(String[] args) throws InterruptedException {
	WebDriver	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	// identify username textBox
	//get the attribute value of username  text box i.e name attribute
	//WebElement usnTB = driver.findElement(By.xpath("//input[@placeholder='Username']"));
//String attributeValue = usnTB.getAttribute("class");
	//System.out.println(attributevalue);
	// identify username textBox
	
	String attributeValue = driver.findElement(By.name("username")).getAttribute("class");
	
		System.out.println(attributeValue);
		Thread.sleep(2000);
		//get css property of username textboxi.e color
	     	// identify login Button
		String cssValue = driver.findElement(By.xpath("//button[text()=' Login ']")).getCssValue("height");
		System.out.println(cssValue);
		//get the tagname of usernametext box
	String	tag= usnTB.getTagName();
	System.out.println(tag);
			
	}

}
//get the attribute value of username  text box i.e name attribute

