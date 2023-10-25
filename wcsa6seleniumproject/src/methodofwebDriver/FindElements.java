package methodofwebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElements {
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("http://desktop-gq18f8q/login.do");
	//identify username textbox and pass the input as admin
	//to identify we use find element
	//once the webelement found it returns webelement (I) and address of webelement
	driver.findElement(By.name("Username"));
	System.out.println();
}
}
