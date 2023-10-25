
	package assignmentpackage;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.firefox.FirefoxOptions;

	public class Vistara {
		public static void main(String[] args) throws InterruptedException {
			FirefoxOptions fo = new FirefoxOptions();
			fo.addArguments("--disable-notifications");
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.airvistara.com");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//span[text()='plan Travel']")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//a[(text()='flights') and (contains(@class,'text-highlight'))]")).click();
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//input[contains(@arial-label,'Search o')]")).sendKeys("pune");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//input[contains(@aria-label,'Search destinat')]")).sendKeys("Delhi");
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//p[text()='1 Adult']")).click();
			Thread.sleep(2000);	
			driver.findElement(By.name("depart")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("div[@monthname='Aug']")).click();
			Thread.sleep(2000);	
			driver.findElement(By.xpath("//a[@class='ui-state-default' and(text()='5')]")).click();
			Thread.sleep(2000);	
			driver.findElement(By.id("pb-searchflight")).click();
			Thread.sleep(2000);	
			driver.quit();
			
}
	}
