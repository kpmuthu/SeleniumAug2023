package assessments.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/window.xhtml;jsessionid=node0ohpw87cjok1dz9p1fgudvj6l12019.node0");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		String title = driver.getTitle();
		System.out.println("Parent window Title "+title);
		
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		

		// Scenario 1:
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<>(windowHandles);
		driver.switchTo().window(list.get(1));
		String title1 = driver.getTitle();
		System.out.println("Parent window Title "+title1);
		
		if(title!=title1)
		{
			System.out.println("New tab opened");
		}
		driver.close();
		
		driver.switchTo().window(list.get(0));
		System.out.println("Scenario1 executed");
		

		//Scenario2 & 3
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> list1 = new ArrayList<>(windowHandles1);
		driver.switchTo().window(list1.get(1));
		String title2 = driver.getTitle();
		System.out.println("Parent window Title "+title2);		
		
		int size = list1.size();
		if (size > 1) {
			System.out.println("Two tabs are opened"+size);
		}
		driver.switchTo().window(list1.get(2));
		driver.close();
		driver.switchTo().window(list1.get(1));
		driver.close();
		driver.switchTo().window(list1.get(0));
		
		System.out.println("Scenario 2 & 3 executed");
		
		//Scenario 4
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		Thread.sleep(15000);
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> list2 = new ArrayList<>(windowHandles2);
		int scenario4size = list.size();
		System.out.println("Scenario 4 window size "+scenario4size);
		driver.switchTo().window(list2.get(1));
		String title3 = driver.getTitle();
		System.out.println("Parent window Title "+title3);
		System.out.println("Scenario 4 executed");
	}

}
