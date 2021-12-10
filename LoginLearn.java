package learningSelenium;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginLearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
			}

	}


