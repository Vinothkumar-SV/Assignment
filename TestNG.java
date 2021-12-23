package week4.dat1;
	
	import java.time.Duration;
import org.openqa.selenium.By;
	
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestNG {
		
		@Test
		 public void loginPage() {
			  WebDriverManager.firefoxdriver().setup();
			  FirefoxDriver driver = new FirefoxDriver();
			 	driver = new FirefoxDriver();
				driver.manage().window().maximize();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				 driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				String Title=driver.getTitle();
				System.out.println(Title);
			
			  
		       }  
	}


