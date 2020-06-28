package selenium_SivaC1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
public class CreateLead extends GenerricMethods {

	
	@Test
	public void createLead() {
		launchBrowser("chrome");
		
		getUrl("http://leaftaps.com/opentaps");		
		
		//Enter Username - (Element level)
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//enter password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click login
		WebElement Loginbutton = driver.findElement(By.className("decorativeSubmit"));
		click(Loginbutton);
		// click crm.sfa link
		WebElement CRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		click(CRMSFA);
		
		
		//click leads
		WebElement Leads = driver.findElement(By.linkText("Leads"));
		click(Leads);
				
		//click create lead link
		WebElement CreatLeadLink = driver.findElement(By.linkText("Create Lead"));
		click(CreatLeadLink);
				
		//company name
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		inputData(companyName, "CTS");
				
		//enter firstName
		driver.findElement(By.cssSelector("input#createLeadForm_firstName")).sendKeys("Gopi");
		//driver.findElementById("createLeadForm_firstName").sendKeys("Gopi");
				
		//enter lastName
		WebElement lastName = driver.findElement(By.cssSelector("#createLeadForm_lastName"));
		inputData(lastName, "J");
				
		//enter firstName local
		WebElement firstNameLocal = driver.findElement(By.cssSelector("input#createLeadForm_firstNameLocal"));
		inputData(firstNameLocal, "Gopi");
		
		//driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Gopi");
				
		//enter lastName local
		WebElement LastNmaeLocal = driver.findElement(By.xpath("//input[@id='createLeadForm_lastNameLocal']"));
		inputData(LastNmaeLocal, "Jayakumar");
				
		//enter salutation
		WebElement Salutation = driver.findElement(By.xpath("//input[@name='personalTitle']"));
		inputData(Salutation, "Mr.");
				
		//Choose source
		WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");
				
				//enter Title
				driver.findElement(By.xpath("//input[@name='generalProfTitle']")).sendKeys("Mr.");
				
				//enter Annual revenue
				driver.findElement(By.xpath("//input[@name='annualRevenue']")).sendKeys("1000");
				
				//choose industry
				WebElement element = driver.findElement(By.id("createLeadForm_industryEnumId"));
				Select dd1 = new Select(element);
				dd1.selectByVisibleText("Insurance");
				
				//choose ownership
				WebElement ele = driver.findElement(By.name("ownershipEnumId"));
				Select dd2 = new Select(ele);
				dd2.selectByVisibleText("Sole Proprietorship");
				
				//enter Sic code
				driver.findElement(By.xpath("//input[@name='sicCode']")).sendKeys("1010");
				
				//enter description
				driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("It is a Software Development company");
				
				//enter impotant note(using CssSelector)
				driver.findElement(By.cssSelector("textarea#createLeadForm_importantNote")).sendKeys("It's a trusted company");
				//driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("It's a trusted company");
				
				//enter country code
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneCountryCode']")).sendKeys("0088");
				
				//enter area code
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneAreaCode']")).sendKeys("682");
				
				//enter extension
				driver.findElement(By.xpath("//input[@id='createLeadForm_primaryPhoneExtension']")).sendKeys("101");
				
				//enter department
				driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("QA");
				
				//choose preferred currency(dropdown)
				
				WebElement ele1 = driver.findElement(By.id("createLeadForm_currencyUomId"));
				Select dd3 = new Select(ele1);
				dd3.selectByVisibleText("BDT - Bangladesh Taka");
				
				
				//enter number of employees
				driver.findElement(By.xpath("//input[@id='createLeadForm_numberEmployees']")).sendKeys("1000");
				
				//enter Ticker symbol
				driver.findElement(By.xpath("//input[@name='tickerSymbol']")).sendKeys("$");
				
				//Enter Person to Ask For
				driver.findElement(By.xpath("//input[@name='primaryPhoneAskForName']")).sendKeys("Gopi");
				
				//Enter Web Url
				driver.findElement(By.xpath("//input[@name='primaryWebUrl']")).sendKeys("www.google.com");
				
				//Enter To Name
				driver.findElement(By.xpath("//input[@name='generalToName']")).sendKeys("Gnath");
				
				//Enter Address Line 1 and 2
				driver.findElement(By.xpath("//input[@name='generalAddress1']")).sendKeys("8821 Saddlehorn Dr");
				//address line 2
				driver.findElement(By.xpath("//input[@name='generalAddress2']")).sendKeys("APT 252");
				
				//Enter City
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalCity']")).sendKeys("DAL");
				
				//Chose State/Province
				WebElement element3 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select dd4 =new Select(element3);
				dd4.selectByVisibleText("Texas");
				
				//Choose Country
				WebElement element4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
				Select dd5 = new Select(element4);
				dd5.selectByVisibleText("Bangladesh");
				
				//Enter Zip/Postal Code
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCode']")).sendKeys("75061");
				
				//Enter Zip/Postal Code Extension
				driver.findElement(By.xpath("//input[@id='createLeadForm_generalPostalCodeExt']")).sendKeys("111");
				
				//Choose Marketing Campaign
				WebElement element5 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
				Select dd6 = new Select(element5);
				dd6.selectByVisibleText("Car and Driver");
				
				//Enter phone number
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("682-207-3636");
				
				//Enter email address
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mrc_77@gmail.com");
				
				//Click Create lead
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				//Verify the first name(for verifying first name, we use getText() and stored the value in firstName and print)
				String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
				System.out.println(firstName);
				
				if(firstName.equals("Gopi"))
				{
					System.out.println("Name is Matched");
				}else {
					System.out.println("Not Match");
				}
				
				closebrowser();
						
			}

		

		
		
		
	}
	

