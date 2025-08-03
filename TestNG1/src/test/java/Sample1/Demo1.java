package Sample1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	WebDriver driver;
	//testng annotation used to create test cases
	//testng annotation are used to prioritized the test cases
	@Test(priority=0)
	public void setUp() throws InterruptedException {
		driver= new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com");
		
	}
	@Test(priority=2)
	public void validateUrlTitle() throws InterruptedException {
		String title=driver.getTitle();
		Assert.assertEquals(title.contains("Facebook"), true);
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url.contains(".com"), true);
		Thread.sleep(4000);
		driver.quit();
	}
	
}
