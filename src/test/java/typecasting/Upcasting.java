package typecasting;

public class Upcasting {

	public static void main(String[] args) {
		// changing subclass type to into superclass type.
		Parent p = new Child();
		p.parent();
		Child c = new Child();
		c.down();

		

	}
}

class Parent {
	void parent() {
		System.out.println("Parent method is called");
	}

}

class Child extends Parent {
	void parent() {
		System.out.println("Parent from child method is called");
	}
	void child() {
		
		System.out.println("child method is called");
	}
	void down() {
		Parent p = new Child();
		// downcast
				Child c = (Child) p;
				c.child();
				super.parent();
	}
}
