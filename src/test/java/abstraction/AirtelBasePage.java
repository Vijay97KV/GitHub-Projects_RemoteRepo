package abstraction;

public class AirtelBasePage {

	String version;
	int band;

	static {

	}

	public AirtelBasePage(String version, int band) {
		this.launchBrowser();
		this.version = version;
		this.band = band;

	}
	
	public void launchBrowser() {
		
		System.out.println("launchBrowser method contains Browser lauch code");
		
	}

}
