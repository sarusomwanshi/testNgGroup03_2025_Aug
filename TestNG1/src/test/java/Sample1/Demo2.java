package Sample1;

import org.testng.annotations.Test;

public class Demo2 {
		@Test(priority=1)
		public void a_method() {
			System.out.println("A");
		}
		@Test(priority=0)
		public void b_method() {
			System.out.println("B");
		}
		@Test(priority=0,invocationCount=3)
		public void c_method() {
			System.out.println("C");
		}
		@Test(priority=1)
		public void x_method() {
			System.out.println("X");
		}
		//B
		//C
		//C
		//C
		//A
		//X
}
