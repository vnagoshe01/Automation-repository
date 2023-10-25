package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOptionMethod {


public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	driver.get("file:///C:/Users/Dhanshri/Desktop/Web%20Element/multipledropdown.html");
  WebElement dropDownElement = driver.findElement(By.name("menu"));
	
Select sel = new Select(dropDownElement);
            
      // select multiple option
      for(int i=3;i<6;i++)
      {
    	  Thread.sleep(2000);
    	  sel.selectByIndex(i);
      }
      
      // get the option that is selected first
      WebElement firstOpt = sel.getFirstSelectedOption();
      System.out.println(firstOpt.getText());
      //wcsm9
      //single select dropdown 
      // webelement dropdown1=driver.findelement(By.id("idddd"));
      //handle the dropdown
      //select  sel = new select(dropdown);
      //select the options from dropdown
     //thread.sleep(2000);
      // sel.selectByvalue("v5");
      //Thread.sleep(2000);
      //get the options which is selected first
      //wbelement firstopt=sel.getFirstSelectionsOptions();
      //get the text of firstopt
      //system.out.println(firstopt.getText());
      
      
      
}

}