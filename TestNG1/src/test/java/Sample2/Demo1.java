package Sample2;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
	
		WebDriver driver;
		
		@Test
		public void login() {
			driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			
		}
}
