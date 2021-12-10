package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contact {

	

		public static void main(String[] args) {
			
		

				WebDriverManager.firefoxdriver().setup();
				
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("http://leaftaps.com/opentaps");
				
		        String title = driver.getTitle();
		        
				System.out.println(title);
			
				driver.manage().window().maximize();
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Contacts")).click();
				
				driver.findElement(By.linkText("Create Contact")).click();
				
				driver.findElement(By.id("firstNameField")).sendKeys("vinoth");
				
		        driver.findElement(By.id("lastNameField")).sendKeys("Kumar");
				
				driver.findElement(By.name("submitButton")).click();
				
		        String text = driver.findElement(By.id("viewContact_fullName_sp")).getText();
		        
		        System.out.println(text);
		        
		        driver.close();
				
			}


}
