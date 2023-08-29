package assessments.week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// Scenarios 1:Type your name

		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext ui-widget')]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'ui-inputfield ui-inputtext ui-widget')]"))
				.sendKeys("Petchimuthu");

		// Scenario 2: Append Country to this City

		driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext ui-widget')])[2]"))
				.sendKeys("India");

		// Scenario 3:Verify if text box is disabled

		boolean enabled = driver
				.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext ui-widget')])[3]"))
				.isEnabled();
		System.out.println(enabled);

		// Scenario 4:Clear the typed text

		driver.findElement(By.xpath("(//input[contains(@class,'ui-inputfield ui-inputtext ui-widget')])[4]")).clear();

		// Scenario 5:Retrieve the typed text
		String text = driver.findElement(By.xpath("(//div[@class='grid formgrid'])[5]/div/input"))
				.getAttribute("value");
		System.out.println(text);

		// Scenario 6:Type email and Tab. Confirm control moved to next element
		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[6]/div/input"))
				.sendKeys("petchimuthu0891@gmail.com");

		driver.findElement(By.xpath("(//div[@class='grid formgrid'])[6]/div/input")).sendKeys(Keys.TAB);
		Thread.sleep(3000);
		boolean displayed = driver.findElement(By.xpath(
				"//textarea[contains(@class,'ui-state-default ui-corner-all ui-inputtextarea-resizable ui-state-focus')]"))
				.isDisplayed();
		System.out.println(displayed);

		// Scenario 7:Type about yourself

		driver.findElement(
				By.xpath("//textarea[contains(@class,'ui-state-default ui-corner-all ui-inputtextarea-resizable')]"))
				.sendKeys("Learning Automation");

		// Scenario 8:Text Editor
		WebElement EditorElement1 = driver.findElement(By.xpath("//div[@class='ql-editor ql-blank']"));
		EditorElement1.sendKeys("Text Editor");
		EditorElement1.sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.xpath("//button[@class='ql-underline']")).click();

		// Scenario 9:Just Press Enter and confirm error message*
		Thread.sleep(10000);
		driver.findElement(By.xpath("//h5[text()='Just Press Enter and confirm error message*']/parent::form/div")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		boolean displayed2 = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).isDisplayed();
		System.out.println(displayed2);

		// Scenario 10:Click and Confirm Label Position Changes
		Thread.sleep(3000);
		driver.findElement(
				By.xpath("//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::input")).click();
		Thread.sleep(2000);
		Point location = driver
				.findElement(
						By.xpath("//h5[contains(text(),'Click and Confirm Label Position Changes')]/following::input"))
				.getLocation();
		System.out.println(location);

		// Scenario 11:Type your name and choose the third option

		driver.findElement(By.xpath("//li[contains(@class,'ui-autocomplete-input-token')]/input")).click();
		driver.findElement(By.xpath("//li[contains(@class,'ui-autocomplete-input-token')]/input")).sendKeys("Babu");
		Thread.sleep(2000);
		driver.findElement(
				By.xpath("//li[contains(@class,'ui-autocomplete-item ui-autocomplete-list-item ui-corner-all')][3]"))
				.click();
		Thread.sleep(2000);
		String attribute = driver
				.findElement(By.xpath("(//h5[text()='Type your name and choose the third option']/following::span)[2]"))
				.getAttribute("innerhtml");

		System.out.println(attribute);

		// Scenario 12:Click and Confirm Keyboard appears

		driver.findElement(By.xpath(
				"//input[contains(@class,'ui-inputfield ui-keyboard-input ui-widget ui-state-default ui-corner-all is-keypad')]"))
				.click();

		Thread.sleep(3000);
		boolean isdisplayed = driver.findElement(By.xpath(
				"//div[contains(@class,'ui-widget ui-widget-content ui-corner-all ui-shadow keypad-popup ui-input-overlay')]"))
				.isDisplayed();

		System.out.println(isdisplayed);

		if (isdisplayed == true) {
			System.out.println("Keyboard is displayed hence Scenario 12 is passed");
		} else {
			System.out.println("Test case Failed try again");
		}

		// Scenario 13:Custom Toolbar

		WebElement EditorElement = driver.findElement(By.xpath("//div[@data-placeholder='Enter your content']/p"));
		EditorElement.sendKeys("Text Editor");
		EditorElement.sendKeys(Keys.CONTROL, "a");
		driver.findElement(By.xpath("(//button[@class='ql-bold'])[2]")).click();

	}

}
