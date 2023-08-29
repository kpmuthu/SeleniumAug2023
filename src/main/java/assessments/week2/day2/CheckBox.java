package assessments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Scenario1: Basic Checkbox
		driver.findElement(By.xpath("//span[text()='Basic']")).click();

		// Scenario:2 Notification
		driver.findElement(By.xpath("//span[text()='Ajax']")).click();

		// Scenario3:Choose your favorite language(s)
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//label[text()='Python']")).click();

		// Scenario4:Tri State Checkbox
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-chkbox-icon ui-c ']/parent::div")).click();

		// Scenario5:Toggle Switch
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();

		// Scenario6:Verify if check box is disabled
		Thread.sleep(3000);
		boolean enabled = driver.findElement(By.xpath("//span[text()='Disabled']/parent::div/div/input")).isEnabled();
		System.out.println(enabled);

		// Scenario7:Select Multiple
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h5[contains(text(),'Select Multiple')]/parent::div/div")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//label[text()='Paris'])[2]")).click();

		driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();

		driver.findElement(By.xpath("(//label[text()='Istanbul'])[2]")).click();
		driver.findElement(By.xpath("//h5[text()='Basic Checkbox']")).click();

	}

}
