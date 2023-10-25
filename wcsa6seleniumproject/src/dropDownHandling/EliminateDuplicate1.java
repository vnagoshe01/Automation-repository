package dropDownHandling;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicate1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("\"file:///C:/Users/Dhanshri/Desktop/Web%20Element/multipledropdown.html\"");
        //identify dropdown and store it in refrance  varible
		WebElement dropDownElement = driver.findElement(By.name("menu"));
        //get all the options of menudropdown
		Select sel = new Select(dropDownElement);
		
		// to handle dropdown by eliminate duplicate we use HashSet
		
		    HashSet<String> hs = new HashSet<String>();
		    //read list by using for loop and lemininate duplicate 
	
			it 
			  List<WebElement> allOps = sel.getOptions();
			  
			  // read list by eliminating duplicate
			  for(int i=0;i<allOps.size();i++)
			  {
				   // get the text of ops to add in set
				   String text = allOps.get(i).getText();
				   
				   // add text into HashSet
				   hs.add(text);
			  }
			  
}
}