package learningSelenium;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LeafGroundCheckbox {

		public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.firefoxdriver().setup();				
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://leafground.com/pages/checkbox.html");
			
			 driver.manage().window().maximize();
			 
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				String title = driver.getTitle();
				

				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

				
				System.out.println("Title of the page is:" +title);
				
				driver.findElement(By.xpath("//div[@class='example']//input[1]")).click();
				
			
				
				System.out.println(driver.findElement(By.xpath("//div[text()='Selenium']")).isEnabled());
				
			
		           
		     WebElement deselect = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input"));      
		        
		     if (deselect.isSelected()) {
				
		     deselect.click();
		    	 
			} 
		     WebElement de = driver.findElement(By.xpath("//label[text()='DeSelect only checked']/following::input[2]"));
		         
		     if (de.isSelected()) {
				
		    	 de.click();
		    	 
			}

		     
		     driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[1]")).click();
		     
		     driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[2]")).click();
		     
		     driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[3]")).click();
		     
		     driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[4]")).click();
		        
		     driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input[5]")).click();
		     	
		        	 
				}
		          
		}