package assessments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// Edit Lead By Name Search

		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();

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

		driver.close();
	}

}
