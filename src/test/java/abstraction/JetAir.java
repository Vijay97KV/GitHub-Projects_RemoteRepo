package abstraction;

public class JetAir extends AeroplaneCentral {
//	 name = "vijay";
	public static void main(String[] args) {
		JetAir a = new JetAir();
		System.out.println();
		a.engine();
		a.safety();
		a.Seats();
		a.colorNLogo();
		a.thisClassMethod();
		
		System.out.println(a.name);

	}

	@Override
	public void colorNLogo() {
		System.out.println("JetIndia White");
		// TODO Auto-generated method stub

	}

	@Override
	public void Seats() {
		// TODO Auto-generated method stub
		System.out.println("<200");

	}

	public void thisClassMethod() {
		System.out.println("this class method");
	}

}
