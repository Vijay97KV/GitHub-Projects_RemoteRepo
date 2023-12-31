package nonStatic;

public class Child extends Parent {

	String name="Childname";
	
	public void childmethod() {
		System.out.println("its a childmethod");
	}
	
	public void parentmethod() {
		System.out.println("parentmethod copy in child method");
	}
	public void dowry() {
		System.out.println("i wont take");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		p.parentmethod();
		
		System.out.println(p.name);
		
		Child c= new Child();
		c.childmethod();
		c.parentmethod();
		System.out.println(c.name);
		
		Parent p1 = new Child();
		p1.parentmethod();
		p1.dowry();

		
		
		
	}
}
