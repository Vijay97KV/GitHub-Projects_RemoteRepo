package this_is_super;

import org.testng.annotations.Test;

public class Main {

	@Test
	public void run() {
		ParentClass c = new ParentClass(526);
		c.calculateSSLCPercent();
		
		ChildClass p = new ChildClass(5,8,9);
		p.multiply();
	}

}
