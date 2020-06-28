package com.selenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		
		//C:\Users\mamun\Selenium\Selenium\Drivers
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByLinkText("AGENT LOGIN").click();
		driver.findElementByLinkText("Contact Us").click();
		
		//Set<String> allwin = driver.getWindowHandles();
		//System.out.println(allwin);
	

	    //switch one window to another window
	      //get window handle(),return unique address of active window and data type is string.
		 //String currentWindow = driver.getWindowHandle();
		//System.out.println(currentWindow);
		    
		    //Collection(Set) of String
		    
		   Set<String> allWin = driver.getWindowHandles(); //allWin variable contains all window references. driver.getWindowHandles() stored all Window references in allWin variable.
		   System.out.println(allWin);//Please print all windows reference which were stored in allWin variable.
		    
		    
		 // for each window one by one iterator we use for each iterator
		 		// String eachWin - for each window reference
		 		// allWin - contains all window references because of getWindowHandles() method.
		    
		   for(String eachWin:allWin) { 
			   
		   //System.out.println(eachWin);   
		   driver.switchTo().window(eachWin);	// Switching to child/new window	
		   System.out.println(driver.getTitle());
		   
		   driver.close(); // closing the child/new window
		   driver.switchTo().window(eachWin);	//switch back to parent/primary window
		   
		   }
			
		}

	
	}

