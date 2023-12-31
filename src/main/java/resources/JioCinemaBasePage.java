package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.JioCinemaLandingPage;

public class JioCinemaBasePage {

	// global variables
	// public static Properties prop;
	public WebDriver driver;
	public static Properties properties;
	JioCinemaLandingPage jl;
	// here we include all the common Line of codes of each page..like browser lunch
	// , login, waits, configurations, variables and methods etc..

//common method to launch desired browser
	public WebDriver browserInitializer() throws IOException {

		// to get global config properties
		properties = new Properties();
		// String ConfigfilePath =
		// "D:\\VijayGitProject2.0\\JavaSeleniumProject\\src\\main\\java\\resources\\configuration.properties";
		String ConfigfilePath = System.getProperty("user.dir")
				+ "\\src\\main\\java\\resources\\configuration.properties";
		FileInputStream fis = new FileInputStream(ConfigfilePath);
		properties.load(fis);

		String browsername = properties.getProperty("browser");

		if (browsername.equalsIgnoreCase(properties.getProperty("browser"))) {

			// launch Chrome browser
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		else if (browsername.equalsIgnoreCase("Edge")) {
			// launch edge browser
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else {
			// launch Firefox
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
driver.manage().window().setSize(new Dimension(30,50));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
		// return driver;
	}

	// LoginApplication
	//@BeforeMethod //scope inside the class only
	@BeforeTest
	public JioCinemaLandingPage loginToApp() throws IOException {

		browserInitializer();
		driver.navigate().to(properties.getProperty("JioCinemaURL"));
		JioCinemaLandingPage jl = new JioCinemaLandingPage(driver);
		return jl;

	}

	//@AfterMethod scope inside this class
	@AfterTest
	private void tearDown() {
		driver.quit();
	}
	
	
	
		
	}
	

