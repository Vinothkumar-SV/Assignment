package week7.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	
	public static void main(String[] args) {
		

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/table.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		
		List<WebElement> elements = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr/td[1]"));
		
		for (WebElement names : elements) {
			
			String text = names.getText();
			System.out.println(text);
			
		}
		
		
		System.out.println("Row Data ::");
		
		
		List<WebElement> elements2 = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr[2]/td"));
		
		for (WebElement webElement : elements2) {
			String text = webElement.getText();
			
			System.out.println(text);
		}
		
		
		
		

	}

}
