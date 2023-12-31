package testng.Test;

abstract public class CentralPolicy {
//variable
	public static String concurrent;
	protected static int age;
	 String place;

	// abstract methods or methods without body
	abstract public void Rto();

	abstract public void Police();

	abstract public void PostOffice();

	public void railWaySector() {
		System.out.println("railWaySector power in the hands of centralgovt so EveryState Should Accept");
	}

	public void BankingSector() {
		System.out.println("BankingSector power in the hands of centralgovt");
	}

	public void Military() {
		System.out.println("Military is Under control of CentralGovt");
	}

	public void abstractClassCentralPolicyFeatures() {
		System.out.println("abstract methods are, methods without body so" + "we cannot instatiate abstract classes");

	}
}
