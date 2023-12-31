package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlipkartLandingPage {

	WebDriver driver;

	public FlipkartLandingPage(WebDriver driver) {
		this.driver = driver;
	}

	By newSignup = By.partialLinkText("New to Flipkart?");
	By Phone = By.xpath("//div[@class='IiD88i _351hSN']/input");
	By continueButoon = By.xpath("//div[@class='IiD88i _351hSN']/following::div[2]/button");
	By otpField = By.xpath("//div[@class='IiD88i _351hSN']/following-sibling::div[2]/input");
	By signup = By.xpath("//div[@class='IiD88i _351hSN']/following-sibling::div[3]/button[1]");
	By error = By.cssSelector("span._2YULOR");

	public WebElement newSignup() {
		// TODO Auto-generated method stub
		return driver.findElement(newSignup);
	}

	public WebElement phoneNumber() {
		// TODO Auto-generated method stub
		return driver.findElement(Phone);

	}

	public WebElement continueButoon() {
		// TODO Auto-generated method stub
		return driver.findElement(continueButoon);
	}

	public WebElement otpField() {
		// TODO Auto-generated method stub
		return driver.findElement(otpField);
	}

	public WebElement signupButton() {
		// TODO Auto-generated method stub
		return driver.findElement(signup);
	}

	public WebElement errorMsg() {
		// TODO Auto-generated method stub
		return driver.findElement(error);
	}

}
