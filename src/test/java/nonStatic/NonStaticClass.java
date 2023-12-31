package nonStatic;

public class NonStaticClass {

	public String name;
	protected String id;
	private int age;

	public NonStaticClass(String studentname) {
		name = studentname;
	}

	public void getId(String sid) {
		id = sid;
	}

	public void getAge(int sage) {
		age = sage;

	}

	public void studentDetails() {
		System.out.println("student Name : " + name);
		System.out.println("student Age : " + age);
		System.out.println("student Id : " + id);

	}

	public static void main(String[] args) {
		NonStaticClass obj = new NonStaticClass("Puja");
		obj.getAge(23);
		obj.getId("10x15cv92");
		obj.studentDetails();
	}

}
