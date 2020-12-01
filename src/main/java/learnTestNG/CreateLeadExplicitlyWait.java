package learnTestNG;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateLeadExplicitlyWait {

	ChromeDriver driver;

	@BeforeMethod
	public void launchBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		// WebDriverManager.firefoxdriver().setup();

		driver = new ChromeDriver();

		// load URL
		driver.get("http://leaftaps.com/opentaps");
		// maximize
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		// Enter Username - (Element level)
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// driver.findElement(By.id("username")).sendKeys("DemoSalesManager");

		// Enter Password - (Element level)
		driver.findElementById("password").sendKeys("crmsfa");

		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();

		// click crm/sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
	}

	@Test
	public void createLead() throws IOException {


		// click leads
		driver.findElementByLinkText("Leads").click();


		// click create lead link

		driver.findElementByLinkText("Create Lead").click();

		// company name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");

		// enter firstName

		try {
			driver.findElementByCssSelector("input#createLeadForm_firstName").sendKeys("Hema");
		} catch (NoSuchElementException e) {
			System.out.println("The element not found");
		}

		// enter lastName
		//Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("createLeadForm_lastName")));

		//driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");
		driver.findElementById("createLeadForm_lastName").sendKeys("Ma");

		// enter firstName local
		try {
		driver.findElementByCssSelector("input#createLeadForm_firstNameLocal").sendKeys("Hema");
		System.out.println("Enter firstName successfully");
		
		}catch(NoSuchElementException e) {
			System.out.println("The element not found");
		} finally {
			
			//take SnapShot
			 File src = driver.getScreenshotAs(OutputType.FILE);
			
			// the path where it store after move
			 File dest = new File("./snap/image.png");
			
			 //move/copy file sre to dest
			 FileUtils.copyFile(src, dest);
		}
		// driver.findElementByXPath("//input[@id='createLeadForm_firstNameLocal']").sendKeys("Hema");

		// enter lastName local
		driver.findElementByXPath("//input[@id='createLeadForm_lastNameLocal']").sendKeys("Ma");

		// enter salutation
		driver.findElementByXPath("//input[@name='personalTitle']").sendKeys("Mrs.");

		// Choose source
		WebElement src = driver.findElementById("createLeadForm_dataSourceId");
		Select dd = new Select(src);
		dd.selectByVisibleText("Website");

		// enter Title
		driver.findElementByXPath("//input[@name='generalProfTitle']").sendKeys("Mrs.");

		// enter Annual revenue
		driver.findElementByXPath("//input[@name='annualRevenue']").sendKeys("1000");

		// choose industry
		WebElement element = driver.findElementById("createLeadForm_industryEnumId");
		Select dd1 = new Select(element);
		dd1.selectByVisibleText("Insurance");

		// choose ownership
		WebElement ele = driver.findElementByName("ownershipEnumId");
		Select dd2 = new Select(ele);
		dd2.selectByVisibleText("Sole Proprietorship");

		// enter Sic code
		driver.findElementByXPath("//input[@name='sicCode']").sendKeys("1010");

		// enter description
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("It is a Software Development company");

		// enter important note(using CssSelector)
		driver.findElementByCssSelector("textarea#createLeadForm_importantNote").sendKeys("It's a trusted company");
		// driver.findElementByXPath("//textarea[@name='importantNote']").sendKeys("It's
		// a trusted company");

		// enter country code
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneCountryCode']").sendKeys("0088");

		// enter area code
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneAreaCode']").sendKeys("682");

		//enter phone number
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneNumber']").sendKeys("2084048");;

		// enter extension
		driver.findElementByXPath("//input[@id='createLeadForm_primaryPhoneExtension']").sendKeys("101");

		// enter department
		driver.findElementByXPath("//input[@id='createLeadForm_departmentName']").sendKeys("QA");

		// choose preferred currency(dropdown)

		WebElement ele1 = driver.findElementById("createLeadForm_currencyUomId");
		Select dd3 = new Select(ele1);
		dd3.selectByVisibleText("BDT - Bangladesh Taka");

		// enter number of employees
		driver.findElementByXPath("//input[@id='createLeadForm_numberEmployees']").sendKeys("1000");

		// enter Ticker symbol
		driver.findElementByXPath("//input[@name='tickerSymbol']").sendKeys("Tk");

		// Enter Person to Ask For
		driver.findElementByXPath("//input[@name='primaryPhoneAskForName']").sendKeys("Hema");

		// Enter Web Url
		driver.findElementByXPath("//input[@name='primaryWebUrl']").sendKeys("www.google.com");

		// Enter To Name
		driver.findElementByXPath("//input[@name='generalToName']").sendKeys("Ravi");

		// Enter Address Line 1 and 2
		driver.findElementByXPath("//input[@name='generalAddress1']").sendKeys("8821 Saddlehorn Dr");
		// address line 2
		driver.findElementByXPath("//input[@name='generalAddress2']").sendKeys("APT 152");

		// Enter City
		driver.findElementByXPath("//input[@id='createLeadForm_generalCity']").sendKeys("DAL");

		// Chose State/Province
		try{
		WebElement element3 = driver.findElementById("createLeadForm_generalStateProvinceGeoId1");
		Select dd4 = new Select(element3);
		dd4.selectByVisibleText("Texas");
		System.out.println("Select State successfully");
		
		}catch(NoSuchElementException e){
			System.out.println("Element not found");
		
		}finally {
			//take snapshot
			File source = driver.getScreenshotAs(OutputType.FILE);
			// the path where it store after move
			File target = new File("./snap/image.png");
			
			FileUtils.copyFile(source, target);
		}
		// Choose Country
		WebElement element4 = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select dd5 = new Select(element4);
		dd5.selectByVisibleText("Bangladesh");

		// Enter Zip/Postal Code
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCode']").sendKeys("75061");

		// Enter Zip/Postal Code Extension
		driver.findElementByXPath("//input[@id='createLeadForm_generalPostalCodeExt']").sendKeys("111");

		// Choose Marketing Campaign
		WebElement element5 = driver.findElementById("createLeadForm_marketingCampaignId");
		Select dd6 = new Select(element5);
		dd6.selectByVisibleText("Car and Driver");

		// Enter phone number
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("682-207-3636");

		// Enter email address
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("mrc_77@gmail.com");

		// Click Create lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		// Verify the first name(for verifying first name, we use getText() and stored
		// the value in firstName and print)

		String firstName = driver.findElementById("viewLead_firstName_sp").getText();
		System.out.println(firstName);

		//System.out.println("Element not found");

		if(firstName.equals("Hema")) {
			System.out.println("Name is Matched");
			
		}else {
			System.out.println("Name is not Matched");
		}
		
		/*if (firstName.equals("Hema")) {
			System.out.println("Name is Matched");
		} else {
			System.out.println("Not Match");
		}*/

	}
	
	@Test
	public void editLead() {
		
		
		driver.findElementByLinkText("Leads").click();

		//click Find leads link
		driver.findElementByLinkText("Find Leads").click();
		
		//Click Edit
		/*driver.findElementByXPath("//a[text()='Edit']").click();

		//Change the company name
		driver.findElementById("updateLeadForm_companyName").sendKeys("S");

		//Click Update
		driver.findElementByXPath("//input[@value='Update']").click();*/
	}
	@AfterMethod
	public void closeBrowser(){

		driver.close();

	}
}

