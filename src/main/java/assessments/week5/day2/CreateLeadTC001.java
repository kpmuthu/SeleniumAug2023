package assessments.week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateLeadTC001 extends BaseClass {
	@Test
	public void CreateLeadTestCase() {

		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Petchimuthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kasimani");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("petchimuthu0891@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}

	}

}
