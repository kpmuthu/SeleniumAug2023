package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {	

	
	@Given("Enter username as {string}")
	public void enter_username_as(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);
	}
	@Given("Enter password as {string}")
	public void enter_password_as(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@Given("Click on login button")
	public void click_on_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("Verify navigate to homepage")
	public void verify_navigate_to_homepage() {
		String text = driver.findElement(By.xpath("//h2[contains(text(),'Welcome')]")).getText();
		System.out.println(text);
		if (text.contains("Welcome")) {
			System.out.println("Login successful");
		} else {
			System.out.println("Login not successful");
		}


	}

	@Then("Verify the error message")
	public void verifyErrorMessage() {
		String text = driver.findElement(By.xpath("(//div[@id='errorDiv']/p)[1]")).getText();
		System.out.println(text);
		if (text.contains("Errors Occurred")) {
			System.out.println("Login Failed");
		}
		
		
	}


	/*@Then("Click on Create Lead")
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

	}*/

}
