package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnExplicitWait4 {

	public RemoteWebDriver driver;
	public ChromeOptions options;

	@Test
	public void Clickability() throws Exception {


			ChromeOptions options = new ChromeOptions();
			options.setBinary("116");
			options.addArguments("--disable-notifications");

			ChromeDriver driver = new ChromeDriver(options);
			driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0bb15ia76elqzbo68slethm43501962.node0");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
			
			WebElement text1 = driver.findElement(By.xpath("//span[text()='I am going to change!']"));
			WebElement text2 = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
			
			WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(19));
			wait.until(ExpectedConditions.textToBePresentInElement(text2,"Did you notice?"));
			
		
		
	}

}
