package miscellaneousTopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ByCssSelector {
	
	@Test
	public void cssSelector() {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
	//WebDriverManager.firefoxdriver().setup();

	ChromeDriver driver = new ChromeDriver();
	
	//Maximize
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	//load URL
	driver.get("http://leaftaps.com/opentaps");

	//Enter Username 
	driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");

	//Enter Password - 
	driver.findElementByCssSelector("#password").sendKeys("crmsfa");

	//Click Login Button 
	driver.findElementByCssSelector(".decorativeSubmit").click();

	//click crm/sfa link
	driver.findElementByCssSelector("a[style='color: black;']").click();
	//driver.findElementByLinkText("CRM/SFA").click();

	//click leads
	driver.findElementByLinkText("Leads").click();
	
	//click create lead link
	driver.findElementByLinkText("Create Lead").click();

	//company name
	driver.findElementByCssSelector("#createLeadForm_companyName").sendKeys("TCS");

	//Enter firstName
	
	try {
		driver.findElementByCssSelector("#createLeadForm_firstName").sendKeys("Hema");
	} catch (NoSuchElementException e) {
		System.out.println("The element not found");
	}
	
	//Enter lastName
	driver.findElementByCssSelector("#createLeadForm_lastName").sendKeys("Ma");

	//Click Create Lead Btn
	driver.findElementByCssSelector("input[value='Create Lead']").click();
	
	//Close Browser
	driver.close();
	}


}