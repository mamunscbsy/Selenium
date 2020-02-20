package forPrac;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		 
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//Dropdown
		WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId")); // for Source Element(Dropdown)
		Select dd = new Select(src); //Create d object for Select class for Dropdown
		dd.selectByVisibleText("Partner"); //way 1
		Thread.sleep(2000);
		//dd.deselectByValue("LEAD_PARTNER");//way 2
		dd.selectByIndex(7);//way 3
		System.out.println("Complete");
		
		//take snapshot
				File source = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png");		
				FileUtils.copyFile(source, dest);
				
		
		
		
		
		

	}

}
