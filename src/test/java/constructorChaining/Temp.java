package constructorChaining;

public class Temp {

	int age;
	int phno;
	String name;
	int id;
	String school;
	String place;

	public Temp() {
		this(15);
		System.out.println("i am this class temp No arg constructor ");
	}

	public Temp(int age) {
		this(97417421, "Vijay");

		System.out.println("i am this class Temp constructor 1 arg  where >> age: " + age);
	}

	public Temp(int phno, String name) {
		System.out.println("i am this class temp constructor 2 arg, phno: " + phno + " Name: " + name);
	}

	public Temp(int id, String school, String place) {
		this();
		System.out.println("i am this class temp constructor 3 arg, id: " + id + "school: " + school + " place: " + place);
	}
}
