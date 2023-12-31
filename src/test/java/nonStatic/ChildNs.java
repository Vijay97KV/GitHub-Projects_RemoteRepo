package nonStatic;

public class ChildNs extends NSClass {

	String name = "v"; // Global Maadari
	int age = 25; // Global Maadari

	public static void main(String[] args) {
		// System.out.println(school);
		String name = "vijay"; // local maadari
		int age = 22; // local maadari

		System.out.println("Inside main method Local Varibles: " + name + "-" + age);

		ChildNs c = new ChildNs();

		System.out.println("ChildClassGlobal variable: " + c.name + "-" + c.age);

		NSClass ns = new NSClass();
		ns.sage = 26;
		ns.sname = "Kiran";

		System.out.println("NSClass Global Variable: " + ns.sage + "-" + ns.sname);

		// AnotherWay to use NS vars
		NSClass ns1 = new ChildNs();
		ns1.sage = 58;
		ns1.sname = "ajay";
		System.out.println("NSClass Global Variable: " + ns1.sage + "-" + ns1.sname);

	}

}
