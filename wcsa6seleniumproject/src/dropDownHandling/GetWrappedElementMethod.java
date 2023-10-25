package dropDownHandling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedElementMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		

		driver.get("file:///C:/Users/Dhanshri/Desktop/Web%20Element/multipledropdown.html");
                      WebElement dropdownElement = driver.findElement(By.name("menu"));
		

		Select sel = new Select(dropdownElement);
		
		// read all the options as considers a webelement
		WebElement allOptions = sel.getWrappedElement();
		System.out.println(allOptions.getText());
		
		
		//wcsam9
		//single selct dropdown
		//webelement dropdown1=new Select(dropdown1)
		//get all the options from dropdown by using getwrappedElement
		//WebElemnt akkops=sel.getwrappedelement();
		//system.out.println(allops.getText());
		//get all the opitions from dorpdown by using get options
		//listwebelemnt >options=sel.getoptions();
		////select the options from dropdown without using selections method
	//for(ewbelemnt opt.options )
		//{
			
	//thread.sleep(2000);
		
	//	}
		

	}

}
