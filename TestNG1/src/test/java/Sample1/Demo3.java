package Sample1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Demo3 {
	@Ignore
	@Test(priority=2)
	public void a_method() {
		System.out.println("A");
	}
	//If test case not finished within time then it will throw ThreadTimeoutException
	@Test(priority=1,invocationCount=700000,invocationTimeOut = 1000)
	public void b_method() {
		System.out.println("B");
	}
	
	@Test(priority=-1,timeOut=1000)
	public void c_method() {
		System.out.println("C");
	}
	//CBBBBBBBBBBA
}
