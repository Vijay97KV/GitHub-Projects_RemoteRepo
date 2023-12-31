package this_is_super;

public class ChildClass extends ParentClass {
	int a;
	int c;
	int d;

	public ChildClass(int a, int c, int d) {
		super(a);
		this.a = a;
		this.c = c;
		this.d = d;
		
		int x=100;
		int y =5;
		int z = x/y;
		System.out.println(z);

	}

	public void multiply() {

		System.out.println(c * d);
	}

}
