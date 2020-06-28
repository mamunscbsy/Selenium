package wrapper;

import org.testng.annotations.Test;

public class TC004_DuplicateLead extends GenericWrapper {
	
	@Test
	public void invokeApp() throws InterruptedException {
		
		invokeApp("http://leaftaps.com/opentaps");
		enterById("username", "demosalesmanager");
		enterById("password", "crmsfa");
		// Click Login Button
		clickByXpath("//input[@value='Login']");
		// click crm.sfa link
		clickByLinkText("CRM/SFA");
		//click leads
		clickByLinkText("Leads");
		// click Find lead link
		clickByLinkText("Find Leads");
		//click on email
		clickByXpath("//span[text()='Email']");
		// enter email number
		enterByXpath("//input[@name='emailAddress']", "babu@testleaf.com");
		// click Find leads button
		clickByXpath("//button[text()='Find Leads']");
		// Capture name of First Resulting lead
		Thread.sleep(3000);
		String text = getTextByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		System.out.println(text);
		//Click First Resulting lead
		clickByXpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]");
		// Click Duplicate Lead
		clickByLinkText("Duplicate Lead");
		// Verify the Title as 'Duplicate Lead'
		boolean Title = verifyTitle("title");
		System.out.println(Title);
		
		
	}
	}


