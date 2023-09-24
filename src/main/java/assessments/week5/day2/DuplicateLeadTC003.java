package assessments.week5.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DuplicateLeadTC003 extends BaseClass {

	@Test
	public void DuplicateLeadTestCase() throws InterruptedException {

		driver.findElement(By.xpath("//a[text()='Leads']")).click();

		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("Petchimuthu0891@gmail.com");

		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(2000);
		String Fname=driver.findElement(By.xpath("//a[text()='Petchimuthu']")).getText();
		System.out.println(Fname);
		
		String ID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println(ID);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();

		String leadtitle = driver.getTitle();
		if (leadtitle.contains("Duplicate Lead")) {
			driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
			Thread.sleep(2000);

		}

		String leadname = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if (leadname.contains(Fname)) {
			System.out.println("Duplicate Leads created successfull and testcase passed");

		} else {
			System.out.println("Test case failed");
		}
	}

}
