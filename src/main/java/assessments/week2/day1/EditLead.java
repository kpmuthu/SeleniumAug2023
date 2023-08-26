package assessments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
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
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Petchimuthu&CO");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Petchimuthu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Petchimuthum");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Petchi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("petchimuthu0891@gmail.com");
		WebElement ele = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select statedd = new Select(ele);
		statedd.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();

		String titleName = driver.getTitle();
		System.out.println(titleName);

		if (titleName.contains("View Lead")) {
			
			driver.findElement(By.linkText("Edit")).click();
			
		}
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Selenium Test");
		driver.findElement(By.name("submitButton")).click();
		
		if (titleName.contains("View Lead")) {
			System.out.println("Create Lead Test cased executed successfully and passed");
		} else {
			System.out.println("Create Lead Test cased executed not successfully and its failed");
		}
		driver.close();

	}

}
