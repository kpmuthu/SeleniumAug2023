package assessments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Scenario1: Which is your favorite UI Automation tool?
		
		WebElement findElement = driver.findElement(By.xpath("//h5[contains(text(),'Which is your favorite UI Automation tool?')]/parent::div//select"));
		Select dd=new Select(findElement);
		dd.selectByVisibleText("Selenium");
		
		//Scenario2: Choose your preferred country.
		driver.findElement(By.xpath("//label[contains(text(),'Select Country')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'India')]")).click();
		
		//Scenario3:Confirm Cities belongs to Country is loaded
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Select City')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'Chennai')]")).click();
		
		//Scenario4:Choose the Course
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h5[contains(text(),'Choose the Course')]/parent::div//button")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//h5[contains(text(),'Choose the Course')]/parent::div//input")).sendKeys("Selenium WebDriver");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Selenium WebDriver')]")).click();
		
		//Scenario5:Choose language randomly
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Select Language')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[contains(text(),'Tamil')]")).click();
		
		//Scenario6: Select 'Two' irrespective of the language chosen		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[contains(text(),'Select Values')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[contains(text(),'Select Values')]/parent::ul/li[2]")).click();			
		
	}

}
