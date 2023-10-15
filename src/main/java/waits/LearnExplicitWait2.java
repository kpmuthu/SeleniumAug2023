package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LearnExplicitWait2 {

	@Test
	public void Invisibility() {
		ChromeOptions options = new ChromeOptions();
		options.setBinary("116");
		options.addArguments("--disable-notifications");

		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0bb15ia76elqzbo68slethm43501962.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebElement toHide = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.invisibilityOf(toHide));

	}

}
