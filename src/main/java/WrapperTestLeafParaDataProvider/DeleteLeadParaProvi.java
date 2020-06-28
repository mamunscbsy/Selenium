package WrapperTestLeafParaDataProvider;

import org.testng.annotations.Test;

import psWrapperTestLeafParameterDataPro.PSWrapperTestLeafParameterDataprovider;

public class DeleteLeadParaProvi extends PSWrapperTestLeafParameterDataprovider {
	
	@Test
	public void deleteLead01() {
	//click Leads
	driver.findElementByLinkText("Leads").click();
	
	//click Find lead link
	driver.findElementByLinkText("Find Leads").click();
	
	//click on phone
	driver.findElementByXPath("//span[text()='Phone']").click();
	
	//enter phone number(areaCode)
	driver.findElementByXPath("//input[@name='phoneAreaCode']").sendKeys("682");
	
	//enter phone number
	driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("682-207-3636");
	
	//click Find leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	//Capture lead ID of First Resulting lead
	String leadId = driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10097'])[1]").getText();
	System.out.println(leadId);
	
	//Click First Resulting lead
	driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10097'])[1]").click();
	
	//Click Delete
	//driver.findElementByXPath("//a[text()='Delete']").click();
	
	//Click Find leads
	driver.findElementByXPath("//a[text()='Find Leads']").click();
	
	//Enter captured lead ID
	driver.findElementByXPath("//input[@name='id']").sendKeys("10097");
	
	//Click find leads button
	driver.findElementByXPath("//button[text()='Find Leads']").click();
	
	//Verify error msg
	String errorMsg = driver.findElementByXPath("//div[text()='No records to display']").getText();
	System.out.println(errorMsg);
	
	if(errorMsg.contains("No records")) { 
		System.out.println("ErrorMsg is matched");
	}
	else {
		System.out.println("Not Matched");

}

}

}
