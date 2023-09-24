package assessments.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DeleteLeadTC005 extends BaseClass {

	@Test
	public void DeleteLeadTestCase() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Petchimuthu0891@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);

		String ID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(ID);

		// driver.findElement(By.xpath("//a[text()='Petchimuthu']")).click();

		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(ID);

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000);

		String msgtxn = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		if (msgtxn.contains("No records to display")) {
			System.out.println("Duplicate records are deleted successfully and test case passed");
		} else {
			System.out.println("Test case failed");
		}
	}
}
