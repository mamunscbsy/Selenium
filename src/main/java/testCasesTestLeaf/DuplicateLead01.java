		package testCasesTestLeaf;

		import org.testng.annotations.Test;

		import wrapperTestLeaf.ProjectSpecificWrapperLeaftap;

		public class DuplicateLead01 extends ProjectSpecificWrapperLeaftap{
	
		@Test
		public void duplicateLead01() {
		//click Leads
		driver.findElementByLinkText("Leads").click();
				
		//click Find lead link
		driver.findElementByLinkText("Find Leads").click();
				
		//click on email
		driver.findElementByXPath("//span[text()='Email']").click();
		
		// enter email number
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("mam_C321@gmail.com");
				
		//click Find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();
			
		//Capture name of First Resulting lead
		String FirstResultingLead = driver.findElementByXPath("(//a[text()='Gopinath'])[1]").getText();
		//String FirstResultingLead = driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10009'])[7]").getText();
		System.out.println(FirstResultingLead);
		
		//Click First Resulting lead
		//driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10009'])[5]").click(); 
						
	}

	}



