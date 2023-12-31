package testng.Test;

import java.io.IOException;

import org.testng.annotations.Test;

import pageFactory.JioCinemaLandingPage;
import resources.JioCinemaBasePage;

public class GlobalVarTestClass2 extends JioCinemaBasePage  {

	@Test(dependsOnMethods = { "testMethod1" }, enabled =false)
	public void testMethod2() throws IOException {
		driver.get("https://amazon.com");
		JioCinemaLandingPage jcl = new JioCinemaLandingPage(driver);
		driver.navigate().to("https://www.Flipkart.com/");

		jcl.getMovies();

	}

	@Test(enabled =false)
	public void testMethod1() {

	}
}
