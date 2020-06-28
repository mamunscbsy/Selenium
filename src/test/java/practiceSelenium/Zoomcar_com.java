package practiceSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Zoomcar_com {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		

		driver.get("https://www.zoomcar.com/chennai/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//click on the Start your wonderful Journey link
		
		driver.findElementByXPath("//a[@class='search']").click();
		
		//In the search page. Click on any pick up point under POPULARPICK-UP
		driver.findElementByXPath("(//div[@class='items'])[3]").click();
		
		//click on the Next Button
		driver.findElementByXPath("//button[text()='Next']").click();
		
		//Specify the Start Date as tomorrow Date(Didn't select tomorrows date)
		driver.findElementByXPath("(//div[@class='month'])[2]").click();
		
		//click on the Next Button
		driver.findElementByXPath("//button[@class='proceed']").click();
		
		//Confirm the Start date and click on Done button
		String StartDate = driver.findElementByXPath("(//div[@class='breadcrumb-location'])[2]").getText();
		System.out.println(StartDate);
		
		if(StartDate.contains("Mar")) {
			System.out.println("Date is matched");
		}else {
			System.out.println("Not Matched");
		}
		
		//and click on Done button
		driver.findElementByXPath("//button[text()='Done']").click();
		
		
		
	}

}
