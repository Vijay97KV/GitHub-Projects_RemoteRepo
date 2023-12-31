package optimisedPackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.FlipkartLandingPage;

public class LaunchFlipkart {
	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		String path = "D:\\VijayGitProject2.0\\JavaSeleniumProject\\configuration.properties";
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();

		driver.navigate().to(prop.getProperty("FlipkartURL"));

		FlipkartLandingPage fk = new FlipkartLandingPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		fk.newSignup().click();
		fk.phoneNumber().sendKeys(prop.getProperty("PhoneNo"));
		fk.continueButoon().click();
		fk.otpField().sendKeys("Otp");
		fk.signupButton().click();
		System.out.println(" Error message is..> " + fk.errorMsg().getText());

		driver.close();
	}

}
