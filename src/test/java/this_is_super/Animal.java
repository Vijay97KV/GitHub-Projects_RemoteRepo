package this_is_super;

public class Animal {
	int age;
	String colour;
	
	
	
	public Animal(int a_age, String a_colour){
		this.age = a_age;
		this.colour = a_colour;
	}
	
	public void display() {
		System.out.println("i am from parent animal class");
		System.out.println("age: "+age+" & colour: "+colour);
	}

}
