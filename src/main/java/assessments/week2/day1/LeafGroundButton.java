package assessments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
//----------------Test Case 1;
		driver.findElement(By.linkText("Click")).click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (pageTitle.contains("")) {
			System.out.println("Test case 1: Click button and title verification is successfull and failed");
		} else {
			System.out.println("Test case 1: Click button and title verification is not successfull and failed");
		}
//----------------Test Case2

	}

}
