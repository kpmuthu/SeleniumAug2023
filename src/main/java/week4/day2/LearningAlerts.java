package week4.day2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

		Alert alert = driver.switchTo().alert();

		alert.sendKeys("Petchimuthu");
		String text = alert.getText();
		System.out.println(text);

		alert.accept();

		String text2 = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		if (text2.contains("Petchimuthu")) {
			System.out.println("Alert is accepted " + text2);

		} else {
			System.out.println("Test case failed");
		}
		driver.close();
	}

}
