		package wrapperTestLeaf;

		import org.openqa.selenium.chrome.ChromeDriver;
		import org.testng.annotations.AfterMethod;
		import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

		public class ProjectSpecificWrapperLeaftap {
	
		public ChromeDriver driver;
		
		
		@Parameters({"url","uname","pwd"})
		@BeforeMethod
		public void login(String url, String uname, String pwd) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		//WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
			
		//maximize
		driver.manage().window().maximize();
		
		//load URL
		driver.get("url");
		
		//Enter Username - (Element level)
		driver.findElementById("username").sendKeys("uname");
						
		//Enter Password - (Element level)
		driver.findElementById("password").sendKeys("pwd");
		
		// Click Login Button - (Element level)
		driver.findElementByClassName("decorativeSubmit").click();
		
		// click crm.sfa link
		driver.findElementByLinkText("CRM/SFA").click();
		}
	
		@AfterMethod
		public void closeBrowser() {
		driver.close();
		}
		}
