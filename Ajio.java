package learningSelenium;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Ajio {
	
	
		public static void main(String[] args) throws InterruptedException {
			
		        WebDriverManager.firefoxdriver().setup();
			    FirefoxDriver driver =new FirefoxDriver();
				
				driver.get("https://www.ajio.com/");
				
				driver.manage().window().maximize();
				
				 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
				
				driver.findElement(By.xpath("//label[@for='Men']")).click();
				
				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
				
				String items = driver.findElement(By.xpath("//div[@class='length']")).getText();
				
				System.out.println("no of items :" +items);
				
				List<WebElement> brandName = driver.findElements(By.className("brand"));
				
				System.out.println("List of brands :" +brandName.size());
				
				for (WebElement webElement : brandName) {
					
					String text = webElement.getText();
					
					System.out.println(text);
				}
				// Get the list of names of the bags and print it
				List<WebElement> bagNameList = driver.findElements(By.className("name"));
				
				System.out.println(" Size :" + bagNameList.size());
				
				System.out.println(" Names of the Bags");
				
				for (WebElement webElement : bagNameList) {
					
					String text = webElement.getText();
					
					System.out.println(text);
				}
				
				
				
				
				
				
				
				
				
		}

	}

	
	
	
	
	
	
	
