package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {

		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.navigate().refresh();

		WebElement catag = driver.findElement(By.xpath("//span[text()='Fresh']"));

		Actions obj = new Actions(driver);

		
		obj.moveToElement(catag).perform();
		
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Shop all groceries on Amazon']"));
	
		//obj.click(element).pause(Duration.ofSeconds(20)).perform();
		//obj.click(element).perform();
		
		
		WebElement condition = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
		
		
		
		obj.scrollToElement(condition).perform();
		
		
		
		
		
		
		
		

	}

}
