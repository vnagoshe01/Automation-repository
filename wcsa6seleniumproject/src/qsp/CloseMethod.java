package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	//launch the webapplicating
	driver.get("https://omoyo.bloogspot.com/");
	Thread.sleep(2000);
	driver.close();
}
}
