package optimisedPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import pageFactory.JioCinemaLandingPage;
import resources.JioCinemaBasePage;

public class PlayRandomEpisode extends JioCinemaBasePage {

	@Test
	public void playRecentEpisode() throws IOException {

		JioCinemaLandingPage landingpage = loginToApp();
		landingpage.getMovies();
		landingpage.getSearchbar();
		landingpage.playRandomEpisode().click();;
//watchlist
		landingpage.addToPlaylist();
	}

}
