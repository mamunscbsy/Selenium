package wrapper;

import org.testng.annotations.Test;

public class TC003_DeleteLead extends GenericWrapper {
	
	@Test
	public void deleteLead() throws InterruptedException {
	invokeApp("http://leaftaps.com/opentaps");
	enterByXpath("//input[@id='username']", "DemoSalesManager");
	enterByXpath("//input[@id='password']", "crmsfa");
	clickByXpath("//input[@value='Login']");
	clickByLinkText("CRM/SFA");
	clickByLinkText("Leads");
	clickByLinkText("Find Leads");
	//clickByLinkText("Phone");
	clickByXpath("//span[text()='Email']");
	//enterByName("phoneAreaCode", "682");
	//enterByName("phoneNumber", "2084048");
	//enter email address
	enterByXpath("//input[@name='emailAddress']", "babu@testleaf.com");
	//click Find leads button
	clickByXpath("//button[text()='Find Leads']");
	
	Thread.sleep(3000);
	//Capture lead ID of First Resulting lead
	String text = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	System.out.println(text);
	//Click First Resulting lead
	clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
	
	//click on delete
	//clickByXpath("//a[text()='Delete']");
	//Click Find leads
	clickByXpath("//a[text()='Find Leads']");
	//Verify error msg
	//verifyTextByXpath("//div[text()='No records to display']", "No records");
	// close browser
	quitBrowser();
	
	
	
	
	
	
	
	


}
}
