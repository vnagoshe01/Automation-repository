package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {
	
public static void main(String[] args) throws InterruptedException {
	
	//to launch edge browser create
	WebDriver driver = new EdgeDriver();
	
	//stop the execution of script for 2sec
	Thread.sleep(2000);
	
	//to close edge browser 
	driver.close();
}
}
