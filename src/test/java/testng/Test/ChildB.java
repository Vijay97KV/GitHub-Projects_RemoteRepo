package testng.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import interfaceExamples.AParent;

public class ChildB implements AParent {
	@Test
	@Override
	public void Red() {
		// TODO Auto-generated method stub
		System.out.println("stop");
	}
@Test(dataProvider ="a" )
	@Override
	public void Yellow() {
		System.out.println("Wait");
	}
@DataProvider(name ="testData")
	@Override
	public void Green() {
		System.out.println("Go");

	}
@DataProvider(name="testData")
public Object[][] userId_And_PassCodes(){
	
	Object[][] LoginTestData = new Object[2][3];
	//or
	
	return new Object[][] {{"v@1", "122"}, {"v@2", "456"}, {"V@3", "789"}} ;
	
	
	
	
}

}
