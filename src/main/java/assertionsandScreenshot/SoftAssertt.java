package assertionsandScreenshot;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertt {

	

	@Test
	public void sAssert() {
		
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String actual = driver.getTitle();
		System.out.println(actual);
		
		
		SoftAssert sasrt = new SoftAssert();
		sasrt.assertEquals("arief", actual);
		driver.quit();
		sasrt.assertAll();
		
		
		
		

	}
}
