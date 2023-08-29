package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvanceXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String title = driver.getTitle();
		System.out.println(title);
		
		//---Parent to Child
		driver.findElement(By.xpath("//form/input")).click();
		
		//Child to parent
		driver.findElement(By.xpath("//input//parent::form")).click();
		
		//--Parent to child
		//form/input   ---->need to change
		
		//--Child to parent
		//input//parent::form
		
		
		//----Grand child to grand parent
		//input[@class="react-autosuggest__input react-autosuggest__input--open"]/ancestor::form
		
		//===Grand parent to grand child
		//div[@class='searchbar-view']//input
		
		
		
		
		
		
		

	}

}
