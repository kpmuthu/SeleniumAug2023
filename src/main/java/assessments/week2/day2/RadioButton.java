package assessments.week2.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Scenario1: Your most favorite browser

		driver.findElement(By.xpath("//label[contains(text(),'Chrome')]")).click();
		
		//Scenario2: UnSelectable
		driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'Chennai')]")).click();
		
		//Scenario3:Find the default select radio button

		for (int i = 1; i <= 4; i++) {
			boolean selected = driver
					.findElement(
							By.xpath("(//table[@class='ui-selectoneradio ui-widget'])[6]//tr//td[" + i + "]//input"))
					.isSelected();
			if (selected == true) {
				String text = driver
						.findElement(By
								.xpath("(//table[@class='ui-selectoneradio ui-widget'])[6]//tr//td[" + i + "]//label"))
						.getText();
				System.out.println("By defalut " + text + " browser is selected");
			}
		}
		
		//Scenario4:Select the age group (only if not selected)
		boolean selectedAge = driver.findElement(By.xpath("(//input[contains(@name,'j_idt87:age')])[2]")).isSelected();
		
		if (selectedAge == true)			
			System.out.println("21-40 Years is already selected");


	}

}
