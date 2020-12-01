package seleniumDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 

		//driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");// It's not working right now

		driver.get("http://leaftaps.com/opentaps");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//driver.findElementByLinkText("AGENT LOGIN").click();
		
		driver.findElementByXPath("//input[@id='username']").sendKeys("DemoSalesManager");

		//driver.findElementByXPath("//button[text()='Try it']").click();

		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");

		driver.findElementByXPath("//input[@value='Login']").click();

		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByXPath("//a[text()='Create Lead']").click();

		driver.findElementByXPath("//a[text()='Merge Leads']").click();

		driver.findElementByXPath("//a[text()='Merge']").click();

		//switching to alert and capturing alert message/text
		//way-1
		String ConfirmationAlert = driver.switchTo().alert().getText();
		System.out.println(ConfirmationAlert);
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		//way-2
		/*Alert confirmationAlert = driver.switchTo().alert();
		System.out.println(confirmationAlert.getText());
		
		Thread.sleep(3000);
		
		confirmationAlert.accept();
		//confirmationAlert.dismiss();	*/
		

		
		/*String alertMessage = driver.switchTo().alert().getText();

		Thread.sleep(3000);
		//Displaying alert message
		System.out.println(alertMessage);

		Thread.sleep(3000);
		//Accepting alert
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();*/
	}

}
