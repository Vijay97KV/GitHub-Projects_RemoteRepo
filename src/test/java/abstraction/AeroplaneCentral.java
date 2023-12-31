package abstraction;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

abstract public class AeroplaneCentral {

	
	@DataProvider(name ="dta")
	public void datafeeder() {
		
	}
	
	
	public String name;

	@Test
//	@dataprovider = "dta";
	public void engine() {
		System.out.println("Boeing");
	}

	public void safety() {
		System.out.println("Never Compromised");
	}

	public void weight() {
		System.out.println("NO OVERWEIGHT");

	}

	abstract public void colorNLogo();

	abstract public void Seats();
	
	
	

}
