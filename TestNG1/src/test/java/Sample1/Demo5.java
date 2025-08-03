package Sample1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo5 {
		@Test
		@Parameters({"uname","password","url"})
		public void printParameter(String uname,String password,String url) {
			System.out.println("printParameter method from Demo5 class "+uname+" "+password+" "+url);
		}
}
