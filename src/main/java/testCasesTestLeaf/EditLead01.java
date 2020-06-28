				package testCasesTestLeaf;

				import org.testng.annotations.Test;

				import wrapperTestLeaf.ProjectSpecificWrapperLeaftap;

				public class EditLead01 extends ProjectSpecificWrapperLeaftap{
	
				@Test
				public void editLead01() throws InterruptedException {
				
						
				//click leads link
				driver.findElementByLinkText("Leads").click();
				
				//click Find leads link
				driver.findElementByLinkText("Find Leads").click();
				
				//Enter first name
				driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("Gopi");
				
				//click Find lead button
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				Thread.sleep(3000);
				
				//click on first resulting lead
				String LeadId = driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10188'])[2]").getText();
				System.out.println(LeadId);
				
				driver.findElementByXPath("(//a[@href='/crmsfa/control/viewLead?partyId=10188'])[2]").click();
				
				//Verify title of the page
				String title = driver.getTitle();
				System.out.println(title);
				if(title.contains("View")) {
					System.out.println("Title matched");
				} else {
					System.out.println("Not Matches");
				}
				
				//Click Edit
				driver.findElementByXPath("//a[text()='Edit']").click();
				
				//Change the company name
				driver.findElementById("updateLeadForm_companyName").sendKeys("S");
				
				//Click Update
				driver.findElementByXPath("//input[@value='Update']").click();
				
				//Confirm the changed name appears
				 String changedName = driver.findElementById("viewLead_companyName_sp").getText();
				  System.out.println(changedName);
			 
				  if(changedName.contains("tcs")) {
				  System.out.println("Name is matched"); 
				  
				  } else {
				 System.out.println("Not matched");
				 }
										
				}			
				}



	
	

