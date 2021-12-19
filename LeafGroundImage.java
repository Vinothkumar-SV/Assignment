package learningSelenium;

		import java.io.IOException;
		import java.util.concurrent.TimeUnit;
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.apache.http.HttpResponse;
		import org.apache.http.client.ClientProtocolException;
		import org.apache.http.client.HttpClient;
		import org.apache.http.client.methods.HttpGet;
		import org.apache.http.impl.client.HttpClientBuilder;

		import io.github.bonigarcia.wdm.WebDriverManager;

		public class LeafGroundImage {
			public static void main(String[] args) throws ClientProtocolException, IOException {
				

				WebDriverManager.firefoxdriver().setup();				
				FirefoxDriver driver = new FirefoxDriver();
				driver.manage().window().maximize();

				driver.get("http://leafground.com/pages/Image.html");
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.findElement(By.xpath("//img[@ src='../images/home.png']")).click();
				driver.navigate().to("http://leafground.com/pages/Image.html");
				WebElement imgElement = driver.findElement(By.xpath("//label[text()='Am I Broken Image?']/following-sibling::img"));
				
				HttpClient client = HttpClientBuilder.create().build();
				HttpGet request = new HttpGet(imgElement.getAttribute("src"));
				HttpResponse response = client.execute(request);
				// verifying response code he HttpStatus should be 200 if not,
				// increment as invalid images count
				if (response.getStatusLine().getStatusCode() == 404)
				{
					System.out.println("It is broken image");
				}
				else
				{
					System.out.println("It is not broken image");
				}	
			
			}	
			}	



