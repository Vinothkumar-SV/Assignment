package week4.dat1;




	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Alert {

		public static void main(String[] args) {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.leafground.com/pages/Alert.html");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
			
			org.openqa.selenium.Alert alert = driver.switchTo().alert();
			
			alert.accept();
			
			driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
			
			alert.accept();
			
			
			driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
			
			alert.sendKeys("Technology");
			
			alert.accept();
			
			driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
			
			String text = alert.getText();
			
			System.out.println(text);
			
			alert.accept();
			
			
			driver.findElement(By.xpath("//button[text()='Sweet Alert']")).click();
			
			driver.findElement(By.xpath("//button[text()='OK']")).click();
			
			//driver.close();
			
			
			
	
		}

	}
	
	
