package Sample2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert2 {
		WebDriver driver;
		@Test
		public String hardAssert() {
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/reg");
			String title=driver.getTitle();
			Assert.assertEquals(title.contains("Facebook"), true);
			System.out.println("assert executed............");
			System.out.println("assert executed............");
			return "hello testNG";
			
		}
		@Test
		public void softAssert() {
			SoftAssert softAssert = new SoftAssert();
			softAssert.assertEquals(12, 12);
			System.out.println("soft assert ........");
			softAssert.assertAll();
			System.out.println("soft assert ........");
	
			System.out.println(hardAssert());
		}
}
