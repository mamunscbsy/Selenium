package miscellaneousTopic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {
	
	@Test
	public void assertEquals() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//driver.getTitle();
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		//Assert.assertEquals(title, "Google");
		//Assert.assertEquals(title, "Google","Asserting the Title");
		//Assert.assertEquals(title, "Google", "Asserting the Title");
		
		Assert.assertEquals(title, "Google", "Asserting the Title");
		
		//SearchBox is displayed or not in the page
		
		boolean searchBox = driver.findElementByName("q").isDisplayed();
		System.out.println(searchBox);
		
		//boolean searchBox = driver.findElementByName("q").isDisplayed();
		//System.out.println(searchBox);
		
		//boolean searchBox = driver.findElementByName("q").isDisplayed();
		//Assert.assertTrue(searchBox, "Verify if the searchbox is displayed");
		
		Assert.assertTrue(searchBox, "Verify if the searchbox is displayed");
	
		//Assert.assertTrue(condition, message);
		
		driver.close();
	}

}
