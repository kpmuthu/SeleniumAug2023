package assessments.week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Petchimuthu");
		driver.findElement(By.id("lastNameField")).sendKeys("Kasimani");
		
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Petchi");
		
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Muthu");
		
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		
		driver.findElement(By.id("createContactForm_description")).sendKeys("Test");
		
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("Petchimuthu0891@gmail.com");
		
		WebElement findElement = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(findElement);
		dd1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String name=driver.findElement(By.xpath("//span[contains(text(),'Petchimuthu Kasimani')]")).getText();
		if(name.contains("Petchimuthu"))
		{
			System.out.println("Contact created successfully and Test case passed");
			
			driver.findElement(By.xpath("//a[text()='Edit']")).click();
			driver.findElement(By.id("updateContactForm_description")).clear();
			
			driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Testing");
			
			driver.findElement(By.xpath("//input[@name='submitButton']")).click();
			String subtitle=driver.getTitle();
			System.out.println(subtitle);			
			
		}
		else
		{
			System.out.println("Contact not created successfully and Test case failed");
		}		
		
		

	}

}
