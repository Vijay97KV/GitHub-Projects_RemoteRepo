package testng.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Global3 {
	
	
	@DataProvider(name = "gmailValidation")
	public String[][] data() {
		int a = 2;
		int b = 3;
		if (a > b) {
			return new String[][] 
			     {
				      { "vijayyyyyyyyy", "123" },
				      { "kumarrrrrrrrrrr", "456" }, 
				      { "kvvvvvvv", "789" } 
				 };
		}

		else
			return new String[][] 
					{  
			           { "vijay97@gmail.com", "@12354557" }, 
			           { "vijay99@gmail.com", "%12354557" },
					   { "vijay98@gmail.com", "$12856227" } 
					};

	}

	@Test(groups= {"smoke"})
	public void testcase7() {
		System.out.println("=====================================");

		System.out.println("i am a smoke Test case: testcase7 ");
	}
   @Test(groups ={"smoke","fullregression"})
	public void testcase8() {
		System.out.println("=====================================");

		System.out.println("i am a smoke Test case : testcase8");


	}

	@Test
	public void testcase9() {
		System.out.println("testcase9");


	}
	
	
}
