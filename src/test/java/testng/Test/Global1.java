package testng.Test;

import org.testng.annotations.Test;

public class Global1 extends GlobaSwitchl0 {
String url = "https://amzon.com";
	//@Parameters({ "url2" })
	@Test
	public void testcase1() {
		System.out.println(url);

	}

	@Test(groups="smoke")
	public void testcase2() {
		System.out.println("================================================= ");

		System.out.println(g);
		System.out.println("i am a smoke Test case ");

	}

	@Test
	public void testcase3() {

	}
	// Java Program to check the size
	// using the switch...case statement

	@Test(groups="smoke")
	  public void main() {
		System.out.println("================================================= ");


	    int number = 44;
	    String size;

	    // switch statement to check size
	    switch (number) {

	      case 29:
	        size = "Small";
	        break;

	      case 42:
	        size = "Medium";
	        break;

	      // match the value of week
	      case 44:
	        size = "Large";
	        break;

	      case 48:
	        size = "Extra Large";
	        break;
	      
	      default:
	        size = "Unknown";
	        break;

	    }
	    System.out.println("Size: " + size);
		System.out.println("i am a smoke Test case ");

	  }
	}

