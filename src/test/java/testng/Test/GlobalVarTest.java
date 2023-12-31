package testng.Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import resources.JioCinemaBasePage;


public class GlobalVarTest extends JioCinemaBasePage {

	WebDriver driver;
	
	@Test(description = "dummy", groups = {"smoke","fullregression"}, alwaysRun =true)
	public void name() {
		System.out.println("i am a smoke Test case ");

		
	}
	

@Test(priority = 5, invocationCount= 1, invocationTimeOut =20, enabled=false)
public void testMethod1() {
	driver.get("https://youtube.com/"); 
	
	
}


}
