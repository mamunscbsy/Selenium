package com.selenium;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learnalert {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); // For Chrome
		
				
		//driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");// It's not working right now
		
		//driver.get("https://www.w3schools.com/jsref/met_win_alert.asp");
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);// It's not working right now
		
		driver.findElementByLinkText("Try it Yourself »").click();
		
		driver.switchTo().frame(0);
		
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		String text = driver.switchTo().alert().getText();
		
		System.out.println(text);
		
		driver.switchTo().alert().accept();
		
		//driver.close();
		
		

	}
	
	}
