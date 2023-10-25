package popUpHandling;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopUp {
	 public static void main(String[] args) throws InterruptedException {
         WebDriver	driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
              driver.get("file:///C:/Users/Dhanshri/Desktop/popup/confirmationpopup.html");
           //genrate the alertpopup
          WebElement button = driver.findElement(By.xpath("//input[@type='submit']"));
          button.click();
          //handle confirmation popup by using switch to method
          
            Alert al = driver.switchTo().alert();
           Thread.sleep(2000);
          //al.accept();//to accept the confirmation  popup
        // al.dismiss();//to dismiss the confirmation popup
           System.out.println(al.getText());
          al.accept();
           Thread.sleep(2000);
           driver.close();
	 }
}
