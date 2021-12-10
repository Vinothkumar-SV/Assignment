package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	

				public static void main(String[] args) {

					WebDriverManager.firefoxdriver().setup();				
					FirefoxDriver driver = new FirefoxDriver();
					
					
					driver.get("https://en-gb.facebook.com/");
					
					driver.manage().window().maximize();
				
				
					driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
					
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vinoth");
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("kumar");
					driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("vinothkumarsv9@gmail.com");
					
					
					driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("vinoth%09");
					
					WebElement DateDropdown = driver.findElement(By.xpath("//select[@id='day']"));
					
					Select date = new Select(DateDropdown);
					
					date.selectByValue("18");
					
					
					WebElement MonthDropdown = driver.findElement(By.xpath("//select[@id='month']"));
					
					Select month =  new Select(MonthDropdown);
					
					month.selectByValue("03");
					
					WebElement YearDropdown = driver.findElement(By.xpath("//select[@id='year']"));
					
					Select year = new Select(YearDropdown);
					
					year.selectByValue("1995");
					
					driver.findElement(By.xpath("//label[text()='Male']")).click();
					
					driver.close();
					
					
					
					
					
					
					
					
				
			}
}
