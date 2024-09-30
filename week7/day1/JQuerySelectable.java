package week7.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JQuerySelectable {
	public static void main(String[] args) throws InterruptedException, IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			driver.get("https://jqueryui.com/selectable/");
			//driver.executeScript("document.body.style.zoom='75%';");
			
			//Dimension resolution = new Dimension(1900, 900);
        //driver.manage().window().setSize(resolution);
	//	driver.executeScript("document.body.style.zoom='80%';");

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);

		WebElement item1 = driver.findElement(By.xpath("(//ol[@id='selectable']//li)[1]"));
		WebElement item2 = driver.findElement(By.xpath("(//ol[@id='selectable']//li)[2]"));
		WebElement item3 = driver.findElement(By.xpath("(//ol[@id='selectable']//li)[3]"));
		WebElement item7 = driver.findElement(By.xpath("(//ol[@id='selectable']//li)[7]"));
	
		Actions action = new Actions(driver);
	
		action.keyDown(Keys.CONTROL).click(item1).click(item2).click(item3).perform();
		
		
		action.contextClick(item1).perform();
		
	
		
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snappics/jquery.png");
		FileUtils.copyFile(src, dest);

		File srcelement = item3.getScreenshotAs(OutputType.FILE);
		File destelement = new File("./snappicsparticular/jqueryelement.png");
		FileUtils.copyFile(srcelement, destelement);

	}

}
