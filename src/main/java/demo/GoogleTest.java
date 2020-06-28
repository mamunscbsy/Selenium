package demo;

import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) {

		//Open the browser(chrome browser)
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		//maximize the window
		driver.manage().window().maximize();
	
		//Load url		
		driver.get("http://google.com");
		
		
		
		//get title of the page
		System.err.println(driver.getTitle());
			
		//click About
		driver.findElementByLinkText("About").click();
		//driver.findElementByPartialLinkText("About this").click();
		
		//click products
		driver.findElementByXPath("//a[@title='Products']").click();
		
		//close browser
		
		driver.close();
		
		
	}

}
