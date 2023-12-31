package nonStatic;

public class StudenDetails {
	String id;
	int age;
	String name;
	public static String school = "GLPS";

	static {
		System.out.println("I am a staic method i will execute no matter what!");
	}

	public StudenDetails(String sname) {
		name = sname;
	}

	public void studentInfo() {
		// TODO Auto-generated method stub
		System.out.println("student name: " + name);
		System.out.println("student age: " + age);
		System.out.println("student id: " + id);

	}

	public static void main(String[] args) {
		StudenDetails s = new StudenDetails("Kaanchana");
		s.age = 12;
		s.id = "s10";
		s.studentInfo();

		StudenDetails s1 = new StudenDetails("Kalpi");
		s1.age = 16;
		s1.id = "s11";
		s1.studentInfo();
		
		System.out.println(school);

	}

}
