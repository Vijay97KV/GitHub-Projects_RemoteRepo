package polymorphism;

public class Fox extends Animal{

	

	public void eat() {
		System.out.println("Fox also eat");
	}
	
	public void run() {
		System.out.println("fox do runing");
	}
	
	public static void main(String[] args) {
		Animal f = new Fox();
		f.eat();
		f.run();
		
		Fox f1 = new Fox();
		f1.eat();
		f1.run();
	}
}
