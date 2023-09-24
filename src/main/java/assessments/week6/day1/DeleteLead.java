package assessments.week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends ProjectSpecificMethod {
	
	
	@BeforeTest
	public void setData() {
		excelFilePath = "./testdata/tc001.xlsx";
		sheetName="sheet5";
	}
	

	@Test(dataProvider = "dyno01")
	public void deleteLeadTestCase04(String Pno) throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();

		// 8 Click on Phone
		driver.findElement(By.xpath("(//span[@class='x-tab-strip-text '])[2]")).click();

		// 9 Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(Pno);

		// 10 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		Thread.sleep(8000);

		// 11 Capture lead ID of First Resulting lead
		String LeadID = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"))
				.getText();

		// 12 Click First Resulting lead
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();

		// 13 Click Delete
		driver.findElement(By.xpath("//a[text()[normalize-space()='Edit']]/following-sibling::a")).click();

		// 14 Click Find leads
		driver.findElement(By.linkText("Find Leads")).click();

		// 15 Enter captured lead ID
		driver.findElement(By.xpath("//label[text()='Lead ID:']/following::input")).sendKeys(LeadID);

		// 16 Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		// 17 Verify message "No records to display" in the Lead List. This message
		// confirms the successful deletion

		Thread.sleep(2000);
		String verifymessage = driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();

		if (verifymessage.contains("No records to display")) {
			System.out.println("deleteLeadTestCase04--> confirms the successful deletion- This case is PASSED");
		} else {
			System.out.println("This case is FAILED");
		}

		// 18 Close the browser (Do not log out)

		System.out.println("Assignment 02.4 has been completed successfully");
	}

}
