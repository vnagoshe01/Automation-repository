package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectionMethods {
	public static void main(String[] args) throws InterruptedException {
	 	WebDriver driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 		 	driver.get("file:///C:/Users/Dhanshri/Desktop/Web%20Element/multipledropdown.html");
	 	WebElement dropDownEle = driver.findElement(By.name("menu"));
	 	
	  Select sel = new Select(dropDownEle);
	  
//	     // select single option from multiselect dropdown
   // A)sel.selectByIndex(2);
  Thread.sleep(2000);
//	     // deselect single option from multiselect dropdown
  //B)sel.deselectByIndex(2);
//	
	
//	     
//	     C) select multiple options 

 // for (int i=0;i<3;i++) {
//	  Thread.sleep(2000);
 //	 sel.selectByIndex(i);
  //}
	  

     
  //   Thread.sleep(4000);
//	     //D) deselect multiple options
   //  for(int i=0;i<3;i++)
   // {
    	 Thread.sleep(2000);
   	// // deselect the options according to index
    //	 sel.deselectByIndex(i);
   //  }
	     
	     
	     
	     
	     
     
////E)		 select multiple option from dropDown By using 
//	      selectByValue();
	
	//String [] array=  {"v1","v2","v3","v4","v5","v6","v7","v8","v9"} ;
	
	//for(int i=0;i<array.length;i++)
//	{
		
	//	Thread.sleep(2000);
	//sel.selectByValue(array[i]);
	//}
	     
	
	//Thread.sleep(4000);
//	//F) deselect By Value
	//for(int i=0;i<array.length;i++)
//	{
		
	//	Thread.sleep(2000);
	//	sel.deselectByValue(array[i]);
//	}
	     
	//G) select the option from multiselect dropdown By using
	   // selectByVisibleText()
	     //sel.selectByVisibleText("gulab jamun");
	    //Thread.sleep(2000);
	     //sel.deselectByVisibleText("gulab jamun");
	     //sel.deselectAll();
	     
           //H) select multiple options 
	    for(int i=0;i<3;i++)
	    {
	     Thread.sleep(2000);
	    	 sel.selectByIndex(i);
	    }
	    Thread.sleep(2000); 
	     sel.deselectAll();
	     
	     
	}     
	     
}
