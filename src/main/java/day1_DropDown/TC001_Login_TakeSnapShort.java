package day1_DropDown;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC001_Login_TakeSnapShort {

	String txt = "Rob";
	int i = 10;

	public static void main(String[] args) throws IOException, InterruptedException {

		// Invoke Chrome Browser
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:./drivers/chromedriver.exe");

		// className obj = new className();
		ChromeDriver driver = new ChromeDriver(); // For Chrome

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		// enter username
		driver.findElementById("username").sendKeys("DemoSalesManager");

		// driver.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");//username

		// enter password
		// driver.findElement(By.id("password")).sendKeys("crmsfa");//password
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		// click login button
		// driver.findElement(By.className("decorativeSubmit")).click();

		// driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();//
		// click login button

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		// click logout
		// driver.findElement(By.xpath("//input[@value='Logout']")).click();

		// click CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();// click CRM/SFA link

		// click create lead link
		driver.findElement(By.linkText("Create Lead")).click();

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("ABC");

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hema");

		// Take snapshot
		File source = driver.getScreenshotAs(OutputType.FILE); // take snapshot and store in Temp File
		//File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png"); //define
		// the path where it store after move
		File dest = new File("./snap/image.png");
		FileUtils.copyFile(source, dest); // moving file source to dest
		
		// Dropdown in Selenium
		// WebElement src = driver.findElement(By.id("createLeadForm_dataSourceId")); //
		// for Source Element(Dropdown)
		WebElement src = driver.findElement(By.xpath("//*[@id=\"createLeadForm_dataSourceId\"]"));
		Select dd = new Select(src); // Create d object for Select class for Dropdown
		dd.selectByVisibleText("Employee"); // way 1
		// dd.selectByValue("LEAD_PR"); //way 2
		// dd.selectByIndex(2); //way 3
		// System.out.println("Done");

		// Take snapshot
		/*File source = driver.getScreenshotAs(OutputType.FILE); // take snapshot and store in Temp File
		// File dest = new File("C:\\Users\\mamun\\Desktop\\snaps\\img.png"); //define
		// the path where it store after move
		File dest = new File("./snaps/img.png");
		FileUtils.copyFile(source, dest);*/ // moving file source to dest

		// click create lead
		driver.findElementByXPath("//input[@value='Create Lead']").click();

		// driver.close();

	}

}
