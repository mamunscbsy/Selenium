package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001_Login {
	
	String txt = "Gopi";
	int i = 10;


	public static void main(String[] args) throws IOException {

		// Invoke Chrome Browser		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");		
		
		//className obj = new className();		
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();		

		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		//driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		
		//driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");//username
		

		//driver.findElement(By.id("password")).sendKeys("crmsfa");//password
		
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		//driver.findElement(By.className("decorativeSubmit")).click();	
		
		//driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();// click login button
		
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
		 //driver.findElement(By.xpath("//input[@value='Logout']")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();//click CRM/SFA link
		
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mamunur");
		
		
		
		
		//Dropdown in Selenium
		//WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId")); // for Source Element(Dropdown)
		WebElement src = driver.findElement(By.xpath("//*[@id=\"createLeadForm_dataSourceId\"]"));
		Select dd= new Select(src); // Create d object for Select class for Dropdown
		dd.selectByVisibleText("Employee"); // way 1	
		// dd.selectByValue("LEAD_PR"); //way 2		
		//dd.selectByIndex(2);  //way 3
		//System.out.println("Done");
		
				
		
		//take snapshot
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png");		
		FileUtils.copyFile(source, dest);//
		
		
		
		
		
		

		driver.close();	


	}

}
