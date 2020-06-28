package psWrapperTestLeafParameterDataPro;

import java.io.IOException; 


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import readExcel.ReadExcel;





public class PSWrapperTestLeafParameterDataprovider {

	public ChromeDriver driver;
	
	@Parameters({"url"})
	@BeforeMethod
	public void login(String url, String uname, String pwd) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
	//WebDriverManager.firefoxdriver().setup();
	driver = new ChromeDriver();
		
	//maximize
	driver.manage().window().maximize();
	
	//load URL
	driver.get("http://leaftaps.com/opentaps");
	
	//Enter Username - (Element level)
	driver.findElementById("username").sendKeys("DemoSalesManager");
	
	//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
	
	//Enter Password - (Element level)
	driver.findElementById("password").sendKeys("crmsfa");
	
	// Click Login Button - (Element level)
	driver.findElementByClassName("decorativeSubmit").click();
	
	// click crm.sfa link
	driver.findElementByLinkText("CRM/SFA").click();
	}

	@AfterMethod
	public void closeBrowser() {
	driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException {		
		ReadExcel rl = new ReadExcel();
		return rl.readExcel();		
		}


}