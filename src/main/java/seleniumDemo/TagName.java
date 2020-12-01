package seleniumDemo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagName {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		//Maximize
		driver.manage().window().maximize();

		// Launch Url
		driver.get("http://leaftaps.com/opentaps/control/main");

		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//enter username
		//driver.findElementById("username").sendKeys("DemoSalesManager");
		
		driver.findElementByCssSelector("#username").sendKeys("DemoSalesManager");

		//enter password
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		Thread.sleep(2000);

		//click login btn
		//driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByClassName("decorativeSubmit").click();

		Thread.sleep(2000);
		//click CRM/SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		//click leads link
		driver.findElementByLinkText("Leads").click();

		//find all link 
				
		List<WebElement> linkList = driver.findElementsByTagName("a");
		//List<WebElement> linkList = driver.findElementsByTagName("a"); 
		
		//List<WebElement> linkList = driver.findElementsByTagName("a");
		System.out.println(linkList.size());
		
		// linktext from all link
		
		/*for (int i = 0; i <linkList.size(); i++) {
			String Linklist = linkList.get(i).getText();
			
			System.out.println(Linklist);
			}*/
		
		//find all div tag
		List<WebElement> allDivTag = driver.findElementsByTagName("div");
		System.out.println(allDivTag.size());
		
		//find all tr tag
		List<WebElement> allTrTag = driver.findElementsByTagName("tr");
		System.out.println(allTrTag.size());
		
		//find all input tag
		List<WebElement> allInputTag = driver.findElementsByTagName("input");
		System.out.println(allInputTag.size());
				
		Thread.sleep(2000);
		driver.close();



	}

}
