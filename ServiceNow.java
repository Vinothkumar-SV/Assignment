package week4.dat1;

	import java.io.File;
	import java.io.IOException;
	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ServiceNow {

		public static void main(String[] args) throws InterruptedException, IOException {
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			
			driver.get("https://dev69706.service-now.com/login.do?user_name=admin&sys_action=sysverb_login&user_password=IDh0dTabRV3v");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Thread.sleep(2000);
			
			driver.findElement(By.id("user_name")).sendKeys("admin");
			
			driver.findElement(By.id("user_password")).sendKeys("Iniyan@123");
			
			driver.findElement(By.xpath("//button[text()='Log in']")).click();
			
			driver.findElement(By.xpath("//input[@placeholder='Filter navigator']")).sendKeys("incident");
			
			driver.findElement(By.xpath("(//div[text()='All'])[2]")).click();
			
			driver.switchTo().frame("gsft_main");
			
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			driver.findElement(By.id("lookup.incident.caller_id")).click();
			
	        Set<String> windowHandles = driver.getWindowHandles();
			
			List<String>handles = new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(handles.get(1));
			
			driver.findElement(By.linkText("Abel Tuter")).click();
			
			driver.switchTo().window(handles.get(0));
			
		    driver.switchTo().frame("gsft_main");
			
			driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("Good Tutor");
			
			String attribute = driver.findElement(By.id("incident.number")).getAttribute("Value");
			
			System.out.println(attribute);
			
			//driver.switchTo().frame("currentView().params.sys_id");
			
			driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
			
			WebElement number = driver.findElement(By.xpath("//div[@role='search']//input[1]"));
			
			number.sendKeys("INC0010040");
			
			number.sendKeys(Keys.ENTER);
			
		    File source = driver.getScreenshotAs(OutputType.FILE);
			
			File destination = new File("./Screenshot/servicenow1.png");
			
			FileUtils.copyFile(source, destination);
			
			
			if(attribute == "INC0010038") {
				
				System.out.println("Incident is created successfully");
				
				
			}
			
			else {
				
				System.out.println("Not successful");
			}
			

		}

	}
