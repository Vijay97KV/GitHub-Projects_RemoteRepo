package nonStatic;

public class Laptop {

	int ram;
	int rom;
	String processor;
	int price;

	// constructor
 public Laptop(int ram, int rom, int rate, String procc) {
		this.ram = ram;
		this.rom = rom;
		this.price = rate;
		this.processor= procc;

	}

	public void getpcDetails() {
		System.out.println("ur pc Ram: " + ram);
		System.out.println("ur pc Rom: " + rom);
		System.out.println("ur pc processor is: " + processor);
		System.out.println("ur pc Price: " + price);

	}

}
