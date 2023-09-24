package assessments.week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditLeadTC002 extends BaseClass {
	@Test
	public void EditLeadTestCase() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Petchimuthu");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Petchimuthu']")).click();

		String edittitle = driver.getTitle();
		System.out.println(edittitle);

		driver.findElement(By.xpath("//a[text()='Edit']")).click();

		driver.findElement(By.id("updateLeadForm_companyName")).clear();

		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Petchi&CO");

		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

		String updatedname = driver.findElement(By.id("viewLead_companyName_sp")).getText();

		if (updatedname.contains("Petchi&CO")) {
			System.out.println("Company name updated with " + updatedname + "and test case passed");
		} else {
			System.out.println("Test case failed");
		}


	}

}
