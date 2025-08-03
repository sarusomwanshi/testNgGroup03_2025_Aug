package Sample1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo4 {
				@Parameters({"uname","password","url"})
				@Test
				public void  parameterRead(String uname,String password,String url) {
					System.out.println("parameterRead method from Demo4 class "+uname+" "+password+" "+url);
				}
}
