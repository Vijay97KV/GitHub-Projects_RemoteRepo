package optimisedPackage;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import resources.JioCinemaBasePage;

public class JioCinemaErrorValidation extends JioCinemaBasePage {

	@Test
	public void jioCInemaHomepageValidation() throws IOException {

		loginToApp();

		String currenturl = driver.getCurrentUrl();
		String currenpageTitle = driver.getTitle();

		// verifying a site Using Assertions using TestNg
		//Assert.assertEquals(properties.getProperty("JioCinemaURL"),currenturl);
		Assert.assertEquals(properties.getProperty("JioCinemaHomePageTitle"), currenpageTitle);
		System.out.println("Page URL & Title is Verified");

	}
}
