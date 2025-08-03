package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo2 {
		WebDriver driver;
		@Test
		public void openUrl() {
			driver = new EdgeDriver();
			driver.get("https://www.facebook.com/reg");
		}
}
