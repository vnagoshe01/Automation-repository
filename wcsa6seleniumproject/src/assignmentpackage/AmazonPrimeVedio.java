package assignmentpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonPrimeVedio {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg0ih2ACZjaUqRs0P83vP9_uOw1KcefsolfWw8LAQ2M5IAAAAAQAAAABktkL1cmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Foffers%2Fnonprimehomepage-dc%3Fgclid%253DCj0KCQjw8NilBhDOARIsAHzpbLC_4muf3P9CFM4CWQ6TVcrxgdXkjksvxAKgJAZexnb3OJNLEOIYB6MaAum9EALw_wcB%2526ref_%253Ddvm_pds_amz_in_as_s_gm_29_mkw_swg7vygAw%2526mrntrk%253Dpcrid_657901934528_slid__pgrid_84577172368_pgeo_9301536_x__adext__ptid_kwd-299239018742&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=257-0909640-7696245&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	Thread.sleep(2000);
	 //identify email text box
    driver.findElement(By.id("ap_email")).sendKeys("vish@123");
    Thread.sleep(2000);
  //identify password text box
	driver.findElement(By.id("ap_password")).sendKeys("23445");
	
	Thread.sleep(2000);
	//identify sign in button

	driver.findElement(By.id("signInSubmit")).click();
			
			
	
     driver.close();
	}

}
//"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Feu.primevideo.com%2Fregion%2Feu%2Fauth%2Freturn%2Fref%3Dav_auth_ap%3F_t%3Dsg1VIg2GEOpB58kjNccu4DPVmzRDkcM8i4iY1ib3OJ3GkAAAAAQAAAABktkEKcmF3AAAAAPgWC9WfHH8iB-olH_E9xQ%26location%3D%2Fregion%2Feu%2F%3Fref_%253Datv_auth_pre&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&accountStatusPolicy=P1&openid.assoc_handle=amzn_prime_video_sso_in&openid.mode=checkid_setup&siteState=259-3998534-1365235&language=en_US&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"