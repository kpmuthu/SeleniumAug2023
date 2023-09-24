package week6.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends BaseClass {

	@BeforeTest
	public void setvalues() {
		System.out.println("before Test started");
		excelFilePath = "./testdata/LeadsTestData.xlsx";
		sheetname = "CreateLead";

	}

	@Test(dataProvider = "testdata")
	public void CreateLeadTestCase(String uName, String Pword, String cName, String fN, String lN, String localfn,
			String department, String description, String Email, String StateProvince) {
		

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fN);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lN);

		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys(localfn);
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys(department);
		driver.findElement(By.name("description")).sendKeys(description);
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys(Email);

		WebElement elementStateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd = new Select(elementStateProvince);
		dd.selectByVisibleText(StateProvince);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		} else {
			System.out.println("Lead is not created");
		}	

	}
}
