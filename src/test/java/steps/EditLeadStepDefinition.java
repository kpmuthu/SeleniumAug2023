package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditLeadStepDefinition extends BaseClass {
		
	@Then("Click on Lead")
	public void click_on_lead() {
		driver.findElement(By.linkText("Leads")).click();
	    
	}
	@Then("click on findLeads")
	public void click_on_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();
	    
	}
	@Then("Enter firstname as {string}")
	public void enter_firstname_as(String fN) {
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fN);
	    
	}
	@Then("click on find leads button")
	public void click_on_find_leads_button() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    
	}
	@Then("click on first record from search result")
	public void click_on_first_record_from_search_result() throws InterruptedException {
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	    
	}
	@Then("click on Edit button")
	public void click_on_edit_button() {
		driver.findElement(By.linkText("Edit")).click();
	    
	}
	@Then("update the company name (.*)$")
	public void update_the_company_name(String cName) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cName);
		
	   
	}
	@Then("click on update")
	public void click_on_update() {
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	    
	}
	@Then("verify the company name is updated")
	public void verify_the_company_name_is_updated() {
		String text2 = driver.findElement(By.xpath("//span[text()='Company Name']/following::span")).getText();

		System.out.println("Newly updated Company Name :" + text2);
		if (text2.contains("Petchi&CO")) {
			System.out.println("editLeadTestCase02--> This case is PASSED");
		} else {
			System.out.println("This case is FAILED");
		}

	    
	}

}
