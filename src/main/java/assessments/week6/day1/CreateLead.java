package assessments.week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends ProjectSpecificMethod {

	@BeforeTest
	public void setData() {
		excelFilePath = "./testdata/tc001.xlsx";
		sheetName="sheet1";

	}

	@Test(dataProvider = "dyno01")
	public void createLeadTestCase01(String uName, String Pword, String cName, String fN, String lN, String localfn,
			String department, String description, String Email, String StateProvince) throws InterruptedException {
		
		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fN);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lN);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(localfn);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(department);
		driver.findElement(By.name("description")).sendKeys(description);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");

		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateProvince);
		dd.selectByVisibleText(StateProvince);

		driver.findElement(By.name("submitButton")).click();

		String title = driver.getTitle();
		System.out.println("Title of Resulting Page is " + title);

		if (title.contains("View Lead")) {
			System.out.println("createLeadTestCase01--> Create Lead Test Case is PASSED");

		} else {
			System.out.println("Create Lead Test Case is FAIELD");
		}

	}

}
