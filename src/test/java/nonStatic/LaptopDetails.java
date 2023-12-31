package nonStatic;

import org.testng.annotations.Test;

public class LaptopDetails {

	@Test
	public void getUrQuotation(){
		
		// Laptop details to be displayed when flipkart user click on Laptop 1(he may click on laptop img or text)
		Laptop l1 = new Laptop(8,256, 55000, "I7");
		System.out.println("Here Displaying ur Gen 1 Dell Laptop");
		l1.getpcDetails();
		System.out.println();
		
		//laptop 2 
		//Gen 2
		Laptop l2 = new Laptop(16,526,75000, "I7");
		System.out.println("Here is ur Gen 2 Dell Laptop");
		l2.getpcDetails();
		
	}
}
