package assessments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Edit Lead By Name Search

		// // Step 1: Download and set the path

		// Step 2: Launch the chromebrowser
		WebDriver driver = new ChromeDriver();

		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");

		// Step 4: Maximise the window
		driver.manage().window().maximize();

		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
		Thread.sleep(2000);

		// Step 7: Enter the first name

		driver.findElement(By.name("firstname")).sendKeys("Petchimuthu");

		// Step 8: Enter the last name

		driver.findElement(By.name("lastname")).sendKeys("Kasimani");

		// Step 10: Enterthe password

		driver.findElement(By.name("reg_passwd__")).sendKeys("Vinoth@123");

		// Step 9: Enter the mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("8428282425");

		// Step 11: Handle all the three drop downs

		WebElement findElement = driver.findElement(By.name("birthday_day"));
		Select dd = new Select(findElement);
		dd.selectByValue("12");
		Thread.sleep(2000);

		WebElement findElement1 = driver.findElement(By.name("birthday_month"));
		Select dd1 = new Select(findElement1);
		dd1.selectByValue("7");
		Thread.sleep(2000);

		WebElement findElement2 = driver.findElement(By.name("birthday_year"));
		Select dd2 = new Select(findElement2);
		dd2.selectByValue("1991");
		Thread.sleep(2000);

		// Step 12: Select the radio button "Female"
		driver.findElement(By.xpath("//label[text()='Female']")).click();
	

	}

}
