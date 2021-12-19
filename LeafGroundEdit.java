package learningSelenium;

	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class LeafGroundEdit {
		public static void main(String[] args) {
			WebDriverManager.firefoxdriver().setup();				
			FirefoxDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("http://leafground.com/pages/Edit.html");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.id("email")).sendKeys("vinothkumarsv9@gmail.com");
			driver.findElement(By.xpath("//label[text()='Append a text and press keyboard tab']/following::input")).sendKeys("vinoth", Keys.TAB);
			System.out.println(driver.findElement(By.name("username")).getAttribute("value"));
			driver.findElement(By.xpath("(//input[@name='username'])[2]")).clear();
			Boolean result = driver.findElement(By.xpath("//input[@disabled='true']")).isDisplayed();
			System.out.println(result);
		}

	}



