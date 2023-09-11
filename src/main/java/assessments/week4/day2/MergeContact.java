package assessments.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MergeContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.findElement(By.partialLinkText("CRM/SFA")).click();

		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

		String parenrtWindow = driver.getWindowHandle();
		String pTitle = driver.getTitle();
		System.out.println("Parent Window Title " + pTitle);

		driver.findElement(By.xpath("//input[@id='partyIdFrom']/../a")).click();

		Set<String> windowHandles = driver.getWindowHandles();

		List<String> list = new ArrayList<>(windowHandles);

		driver.switchTo().window(list.get(1));
		String cTitle = driver.getTitle();
		System.out.println("Chile windoew Title " + cTitle);

		/*
		 * if (cTitle.contains("Flight")) {
		 * 
		 * System.out.println("Driver switched to Child window"); }
		 */

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[1]//td//a")).click();

		driver.switchTo().window(list.get(0));

		driver.findElement(By.xpath("//input[@id='partyIdTo']/../a")).click();

		Set<String> windowHandles1 = driver.getWindowHandles();

		List<String> list1 = new ArrayList<>(windowHandles1);

		driver.switchTo().window(list1.get(1));
		String cTitle1 = driver.getTitle();
		System.out.println("Chile windoew Title " + cTitle1);

		driver.findElement(By.xpath("(//table[@class='x-grid3-row-table'])[2]//a")).click();
		driver.switchTo().window(list.get(0));

		driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();

		Alert alert = driver.switchTo().alert();
		String alerttext = alert.getText();

		alert.accept();

		String title2 = driver.getTitle();

		System.out.println(title2);
		
		if(title2.contains("View Contact"))
		{
			System.out.println("Test case is passed");
		}
		else
		{
			System.out.println("Test case is failed");
		}
		/*
		 * ExpectedCondition<Alert> alertIsPresent =
		 * ExpectedConditions.alertIsPresent(); System.out.println(alertIsPresent);
		 */
		driver.close();
	}

}
