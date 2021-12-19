package learningSelenium;

		import org.openqa.selenium.By;
		
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class LeafGroundButton {
		 
			public static void main(String[] args) {
				
				WebDriverManager.firefoxdriver().setup();				
				FirefoxDriver driver = new FirefoxDriver();
				
				
				driver.get("http://leafground.com/pages/Button.html");
				
				driver.manage().window().maximize();
				 
			    String title = driver.getTitle();
					
				System.out.println("The title of the page is :" +title);
				 
			
					
				System.out.println("The position is : " +driver.findElement(By.id("position")).getLocation());

		       System.out.println("The color value is:" + driver.findElement(By.id("color")).getCssValue("color"));    
		       
		       
		       System.out.println("The size is :" +driver.findElement(By.id("size")).getSize());
						
				
				
		}
		}


			
			