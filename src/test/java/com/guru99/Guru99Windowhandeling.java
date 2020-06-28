package com.guru99;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99Windowhandeling {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/popup.php");
		
		driver.manage().window().maximize();
		
		driver.findElementByLinkText("Click Here").click();
		
		//Switching one window to another
		
		Set<String> allWin = driver.getWindowHandles();
		System.out.println(allWin);
		
		for(String eachWin : allWin) {
			System.out.println(eachWin);
			
			driver.switchTo().window(eachWin);
			System.out.println(driver.getTitle());
			
			driver.findElementById("emailid").sendKeys("mamunurrob1974@gmail.com");
			
			driver.findElementByXPath("//input[@value='Submit']").click();
			
		}
			
		
		

	

	}
}
