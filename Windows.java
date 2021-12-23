package week4.dat1;

	import java.time.Duration;
	import java.util.ArrayList;
	import java.util.List;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class Windows {

		public static void main(String[] args) throws InterruptedException {
			
			
			WebDriverManager.firefoxdriver().setup();
			FirefoxDriver driver = new FirefoxDriver();
			driver.get("http://www.leafground.com/pages/Window.html");
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			driver.findElement(By.xpath("//button[text()='Open Home Page']")).click();
			
			Set<String> windowHandles = driver.getWindowHandles();
			
			List<String>handles = new ArrayList<String>(windowHandles);
			
			driver.switchTo().window(handles.get(1));
			
	        Set<String> secondwindowHandles = driver.getWindowHandles();
			
			List<String>secondhandles = new ArrayList<String>(secondwindowHandles);
			
			secondhandles.addAll(handles);
			
			driver.switchTo().window(secondhandles.get(0));
			
			driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
			
			System.out.println("number of OPened Windows : " +secondhandles.size());
			
			//driver.close();
			
			Set<String> thirdwindowHandles = driver.getWindowHandles();
				
			List<String>thirdhandles = new ArrayList<String>(thirdwindowHandles);
			
			thirdhandles.addAll(handles);
			
				
			driver.switchTo().window(thirdhandles.get(0));
			
			driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
			
			System.out.println("number of OPened Windows : " +thirdhandles.size());
			
			
		}

	}
