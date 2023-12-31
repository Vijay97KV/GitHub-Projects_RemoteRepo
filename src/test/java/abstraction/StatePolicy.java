package abstraction;

import org.testng.annotations.Test;

public class StatePolicy extends CentralPolicy {

	// this class method
	public void StatePolicyClassFeatures() {
		System.out.println(
				"we can extend Abstract classes using extend keyword n also use their methods can be used & we "
						+ "should implement some of its unimplemented methods" + "/n");
	}

	@Override
	public void Rto() {
		System.out.println("Karnataka state Rto : abstract Parent class global variable value: " + concurrent);
	}

	@Override
	public void Police() {
		CentralPolicy cp1 = new StatePolicy();
		place = "Chennai";
		System.out.println("Karnataka state Police :" + place);
	}

	@Override
	public void PostOffice() {
		System.out.println("Karnataka state PostOffice: " + age);
	}

	@Test
	public void RulesToState() {
		age = 300;
		concurrent = "vijay";

		// calling StatePolicy method by creating this class instance
		StatePolicy statePolicyObj = new StatePolicy();

		statePolicyObj.StatePolicyClassFeatures();

		// Calling centralPolicy implemented methods.
		statePolicyObj.abstractClassCentralPolicyFeatures();
		statePolicyObj.railWaySector();
		statePolicyObj.BankingSector();
		statePolicyObj.Military();

//		CentralPolicy cp = new CentralPolicy();//u cannot initiate CentralPolicy

		// calling CentralPolicy Unimplemented methods(can be called as state policy).
		statePolicyObj.Police();
		statePolicyObj.Rto();
		statePolicyObj.PostOffice();

	}

}
