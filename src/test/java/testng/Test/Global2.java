package testng.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Global2 extends Global3{

	@Test
	public void testcase4() {

	}

	@Test
	public void testcase5() {

	}

	@Test(dataProvider = "gmailValidation", invocationCount = 1, timeOut = 5000, groups= {"smoke"})
	public void testcase6(String us, String pw) {
		System.out.println("=====================================");


		System.out.println(us);
		System.out.println(pw);
		System.out.println("i am a smoke Test case ");

	}

	@DataProvider(name = "info")
	public Object[][] getData() {

		Object data[][] = new Object[3][2]; // 3row 2col, 3data combo of 2at time pair

		int a[] = { 2, 2, 4 };
//String data2[][] = {"vcx","236" ,"df""d"};
		data[0][0] = "vijay";
		data[0][1] = "123";
		data[1][0] = "kumar";
		data[1][1] = "456";
		data[2][0] = "kv";
		data[2][1] = "678";

		return data;
	}



}
