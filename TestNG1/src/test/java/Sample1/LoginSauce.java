package Sample1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginSauce {
		@Parameters({"url","username","password"})
		@Test
		public void login(String url,String username,String password) {
				
			ChromeDriver driver =new ChromeDriver();
			
			driver.get(url);
			driver.manage().window().maximize();

			driver.findElement(By.name("user-name")).sendKeys(username);
			driver.findElement(By.name("password")).sendKeys(password);
			driver.findElement(By.name("login-button")).click();
			
		}
}
