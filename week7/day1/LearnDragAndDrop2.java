package week7.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDragAndDrop2 {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");

		WebElement drag = driver.findElement(By.xpath("//div[@id='form:drag']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='form:drop']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(drag, drop).perform();

		// act.dragAndDropBy(drop, 0, 0)

	}

}

/*
 * driver.get("https://www.nykaa.com/");
 * 
 * WebElement hair = driver.findElement(By.xpath("//a[text()='hair']")); Actions
 * obj = new Actions(driver); obj.moveToElement(hair).perform();
 * 
 * //obj.contextClick().perform();
 */
