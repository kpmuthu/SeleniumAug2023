package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AdvancedUserInteraction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");

		RemoteWebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.ajio.com/");
		WebElement findElement = driver.findElement(By.xpath("//a[@title='MEN']"));
		Actions action = new Actions(driver);
		action.moveToElement(findElement).build().perform();
		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@title='Jackets & Coats'])[1]")).click();
		driver.close();

	}

}
