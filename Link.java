package learningSelenium;

	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

		public static void main(String[] args) {
			
			
			WebDriverManager.firefoxdriver().setup();				
			FirefoxDriver driver = new FirefoxDriver();
		    driver.get("http://leafground.com/pages/Link.html");
		     
		     driver.manage().window().maximize();
				
				String title = driver.getTitle();
				
				
				System.out.println("Title of the page is:" +title);
				
				driver.findElement(By.linkText("Go to Home Page")).click();
				
				System.out.println("The link is :" +driver.getCurrentUrl());
				
				 System.out.println("Verification:" + driver.findElement(By.linkText("Verify am I broken?")).isEnabled());
				 	
		}

	}
