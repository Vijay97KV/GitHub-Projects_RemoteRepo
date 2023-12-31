package abstraction;

import org.testng.annotations.Test;

public class StatePolicy2 extends CentralPolicy2 {
	String place = "Gb Palya"; // local yet no role in current class , as it can be used only after creating
								// its obj in some other class only.
	static String place2 = "jp nagar";

	@Test
	public void RulesToState() {
	
		// calling StatePolicy method by creating this class instance
		StatePolicy2 sps = new StatePolicy2();
		sps.place = "Bengalur";

		System.out.println("======================");
		System.out.println("place: " + place); // since its nonstatic and calling within a class so
//		u dont need to create obj(remember if its a method u should create class obj)

		System.out.println("place: " + place2); // since its a static variable 
		
		System.out.println("place: " + sps.place); // StatePolicy2 obj

		
		CentralPolicy2 c = new StatePolicy2();
		c.place = "Pune";
		System.out.println("place: " + c.place); // CentralPolicy2 variable

	}

}
