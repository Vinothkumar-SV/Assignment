package week4.dat1;



	
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class MouseAction {

		public static void main(String[] args) throws InterruptedException {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("https://www.nykaa.com/");
				
				driver.manage().window().maximize();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				
				Actions builder = new Actions(driver);
				
				WebElement brands = driver.findElement(By.xpath("(//a[@class='css-38r9y0'])[2]"));
				
				builder.moveToElement(brands).perform();
				
				WebElement search = driver.findElement(By.xpath("//input[@placeholder='search brands']"));
				
				builder.contextClick(search).sendKeys("L'Oreal Paris").perform();
				
				driver.findElement(By.linkText("L'Oreal Paris")).click();
					
				String title = driver.getTitle();
				
				System.out.println("The title of the page is : " +title);
				
				WebElement DD = driver.findElement(By.xpath("//div[@class='css-0']//button[1]"));
				
				DD.click();
				
				driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
			
				WebElement dd = driver.findElement(By.xpath("//div[@id='first-filter']//div"));
				
				dd.click();
				
				Thread.sleep(2000);
				
				WebElement one = driver.findElement(By.xpath("(//div[@class=' css-15dbf9i'])[1]"));
				
				one.click();
				
				WebElement two = driver.findElement(By.xpath("//span[text()='Hair Care']"));
				
				two.click();
				
				WebElement three = driver.findElement(By.xpath("//span[text()='94']"));
				
				three.click();
				
		        //WebElement four = driver.findElement(By.xpath("(//label[@class='control control-checkbox'])[1]"));
		        
		        //four.click();
		        driver.findElement(By.xpath("//span[text()='Concern']")).click();
		        
		        Thread.sleep(2000);
		        
		        driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		        
		        String attribute = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
		        
		        System.out.println("Product Name is : " +attribute);
		        
		        if(attribute.contains("Shampoo"))
		        	
		        	System.out.println("Filters Applied");
		        else 
		        	
		        	System.out.println("Not Applied");
		        
		        driver.findElement(By.xpath("//div[@id='product-list-wrap']/div[1]/div[1]/div[1]/a[1]/div[2]/div[1]")).click();
		        
		        Set<String> windowHandles = driver.getWindowHandles();
				
				List<String>handles = new ArrayList<String>(windowHandles);
				
				driver.switchTo().window(handles.get(1));
				
				Thread.sleep(2000);

			    String attribute2 = driver.findElement(By.xpath("//span[@class='css-1888qy']/following-sibling::span[1]")).getText();
			    
			    System.out.println("MRP of Shampoo : " +attribute2);
			    
			    driver.findElement(By.xpath("//button[@class=' css-17hv1os']//span")).click();
			    
			    driver.findElement(By.xpath("//span[text()='1']")).click();
			    
			    Thread.sleep(2000);
			    
			    driver.switchTo().frame(0);
			        
			    String text = driver.findElement(By.xpath("//div[text()='220']")).getText();
			    
			    System.out.println("Grand Total : " +text);
			    
			    Thread.sleep(4000);
			    
			    
			    driver.findElement(By.xpath("//button[@class='btn full fill no-radius proceed ']")).click();
			    
			    driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
			    
			    Thread.sleep(2000);
			    
			    String text2 = driver.findElement(By.xpath("(//div[@class='value'])[2]")).getText();
			    
			    if(text2.contains(text))
			    	
			    	System.out.println("Both are same");
			    else
			    	
			    	System.out.println("Not equal");
		        
			
				
				
				
				
				
				
				

		}

	}
	
	
