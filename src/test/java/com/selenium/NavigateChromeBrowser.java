package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateChromeBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		System.out.println("driver.getCurrentUrl");
		System.out.println("driver.getTital"); //login page tital
		
		driver.findElement(By.id("email")).sendKeys("mamunurrob1974@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("720971");
		
		driver.findElement(By.id("//input[@id='u_0_a']")).click();
		
		
		
		
		
		
		
		

	}

}
