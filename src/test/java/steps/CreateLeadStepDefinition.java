package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Then;

public class CreateLeadStepDefinition extends BaseClass{
	

	@Then("Click on crmsfa link")
	public void clickcrmsfalink() {
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
	}

	
	@Then("Click on Create Lead")
	public void clickcreate_lead() {
		driver.findElement(By.partialLinkText("Create Lead")).click();
	}

	@Then("Enter Company name as (.*)$")
	public void entercompanyname(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
	}

	@Then("Enter First name as (.*)$")
	public void enterfirstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@Then("Enter Last name as (.*)$")
	public void enterlastname(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}

	@Then("Clic on CreateLead")
	public void clickcreatelead() {
		driver.findElement(By.name("submitButton")).click();
	}

	@Then("Verify lead is created")
	public void verify_lead_is_created() {
		String titleName = driver.getTitle();
		System.out.println(titleName);

		if (titleName.contains("View Lead")) {
			System.out.println("Create Lead Test cased executed successfully and passed");
		} else {
			System.out.println("Create Lead Test cased executed not successfully and its failed");
		}

	}


}
