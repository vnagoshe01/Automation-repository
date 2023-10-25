package methodofwebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSourcesMethod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1/login.do;jsessionid=2okenq7ekjgwb");
		String loginpagesourcescode = driver.getPageSource();
	
		System.out.println(loginpagesourcescode);
		
	}

}
