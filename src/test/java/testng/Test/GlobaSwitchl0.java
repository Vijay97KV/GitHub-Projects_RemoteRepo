package testng.Test;

import org.testng.annotations.Test;

public class GlobaSwitchl0 {

	@Test(groups="smoke")
	public void SSGymWorkoutShcedule() {
		System.out.println("=====================================");

		int day = 3;
		switch (day) {

		case 1:
			// code
			System.out.println("chest workout");
			break;

		case 2:
			System.out.println("bicep workout");
			break;

		case 3:
			System.out.println("tricep workout");
			break;
		case 4:
			System.out.println("shoulder workout");
			break;
		case 5:
			System.out.println("Leg workout");
			break;
		default:
			System.out.println("Time for torn muscle repair");
			break;

		case 6:
			System.out.println("Holiday/CheatDay");
			break;

		}
		System.out.println("Happy to see u tommorrow");
		System.out.println("i am a smoke Test case ");



	}

	@Test(groups = "smoke")
	public void urShirtSize() {
		System.out.println("=====================================");

		

		int num = 48;
		String size = null;
		switch (num) {

		case 38:
			size = "small";
			break;

		case 40:
			size = "medium";
			break;

		case 42:
			size = "large";
			break;
		case 44:
			size= "XtraLarge";
			
		 default:
			size ="Unavailable, pls meet the Tailer ";
		}
		System.out.println("Size: "+size);
		System.out.println("i am a smoke Test case ");

	}

	int g = 3;

	// @Parameters({"url2"})
	@Test
	public void testcase10() {
		System.out.println("10tc+");

	}

	@Test
	public void testcase20() {

	}

	@Test
	public void testcase30() {

	}

}
