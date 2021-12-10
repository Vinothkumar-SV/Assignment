package learningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestleafLead{

	

		public static void main(String[] args) {
			


			

				WebDriverManager.firefoxdriver().setup();
				
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("http://leaftaps.com/opentaps/control/login");
			
				driver.manage().window().maximize();
				
				String title = driver.getTitle();
				
				driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				
				driver.findElement(By.className("decorativeSubmit")).click();
				
				driver.findElement(By.linkText("CRM/SFA")).click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
			    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VKSolutions");
			    
			    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("vinoth");
			    
			    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
			    
			    WebElement sourceDropDown = driver.findElement(By.id("createLeadForm_dataSourceId"));
			    Select selectSource = new Select(sourceDropDown);
			    selectSource.selectByVisibleText("Website");
			    

			    WebElement meetingCampaignDropDown = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			    Select selectMeeting = new Select(meetingCampaignDropDown);
			    selectMeeting.selectByVisibleText("Automobile");
			    
			    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("vinoth");

			    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kumar");
			    
			    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr");
			    
			    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/18/1995");
			    
			    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate");
			    
			    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tech");
			    
			    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3 Lakhs");
			    
			    WebElement preferredCurrencyDropDown = driver.findElement(By.id("createLeadForm_currencyUomId"));
			    Select selectPreferredCurrency = new Select(preferredCurrencyDropDown);
			    selectPreferredCurrency.selectByVisibleText("INR - Indian Rupee");
			    
			    WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
			    Select selectIndustry = new Select(industryDropDown);
			    selectIndustry.selectByVisibleText("Aerospace");
			    
			    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("300");
			    
			    WebElement ownershipDropDown = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			    Select selectOwnership = new Select(ownershipDropDown);
			    selectOwnership.selectByVisibleText("Partnership");
			    
			    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("@34");

			    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("312");
			    
			    driver.findElement(By.id("createLeadForm_description")).sendKeys("Hi,I am vinoth Kumar From Trichy");
			    
			    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learning automation");
			    
			    
			    //contact info
			    
			    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("600 125");
			    
			    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8220316109");
			    
			    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
			    
			    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Mother");
		        
			    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vinothkumarsv9@gmail.com");
			    
			    driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://github.com/Vinothkumar-SV/Assignment");
			    
			    //primary address
			    
			    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Vinoth Kumar");
			    
			    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Vinoth ");

			    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("NO 52 ");

			    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Manapparai");

			    driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Trichy");
			    
			    WebElement stateDropDown = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			    Select selectProvince = new Select(stateDropDown);
			    selectProvince.selectByVisibleText("California");
			    
			    WebElement countryDropDown = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
			    Select selectCountry = new Select(countryDropDown);
			    selectCountry.selectByVisibleText("India");

			    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("621 306");

			    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("621"); 
			    
				driver.findElement(By.name("submitButton")).click();
				
		        String text = driver.findElement(By.id("viewLead_firstName_VK")).getText();
		        
		        System.out.println(text);
		        
				System.out.println(title);
				
				driver.close();
			    
			}

		
	}

