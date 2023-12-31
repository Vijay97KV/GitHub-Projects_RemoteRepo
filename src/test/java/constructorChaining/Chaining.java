package constructorChaining;

public class Chaining {
int age;
String salary;
String id;
String company = "Ibis";


public Chaining(int eAge, String eSalary) {
	this.age = eAge;
	this.salary = eSalary;
	System.out.println("Employee Age: "+age+" & Salary: "+salary);
	
}

public Chaining(String eID) {
	this(25,"25,0000");
	this.id = eID;
	System.out.println("Employee Id: "+id);
}

public static void main(String[] args) {
	Chaining obj =  new Chaining("E101");
	System.out.println("Company: "+obj.company);
	//Chaining obj2 = new Chaining(25,"21000");
}
	
}
