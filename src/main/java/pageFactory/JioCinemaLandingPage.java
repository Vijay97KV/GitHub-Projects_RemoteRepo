package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JioCinemaLandingPage {

	WebDriver driver;

	public JioCinemaLandingPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Movies")
	WebElement movies;

	@FindBy(css = "#searchInputBox")
	WebElement searchbar;

	@FindBy(xpath = "//*[@id='__next']/div/div[2]/div/div[1]/div[2]/div/div/div[2]")
	WebElement playrandomEpisode;

	@FindBy(xpath = "//*[@id='__next']/div/div[5]/div[1]/div[2]/div/div[2]/div")
	WebElement addtoWatchlistButton;

	public void getMovies() {
		movies.click();
	}

	public void getSearchbar() {
		// TODO Auto-generated method stub
		searchbar.sendKeys("Bigboss Kannnada Seoson 10");
	}

	public WebElement playRandomEpisode() {
		// TODO Auto-generated method stub
		return playrandomEpisode;
	}

	public void addToPlaylist() {
		// TODO Auto-generated method stub
		addtoWatchlistButton.click();

	}

}
