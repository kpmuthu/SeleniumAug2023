package assessments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//-----Test case1 - Which is your favorite UI Automation tool?
		
		WebElement findElement1 = driver.findElement(By.className("ui-selectonemenu"));
		Select dd1=new Select(findElement1);
		dd1.selectByVisibleText("Selenium");
		String value1=driver.findElement(By.className("ui-selectonemenu")).getAttribute("value");
		System.out.println(value1);
		
		//-----Test case2 - Choose your preferred country.
	
		
		

	}

}
