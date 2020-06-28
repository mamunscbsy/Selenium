		package testCasesTestLeaf;

		import java.util.Set;

		import org.testng.annotations.Test;

		import wrapperTestLeaf.ProjectSpecificWrapperLeaftap;

		public class MergeLead01 extends ProjectSpecificWrapperLeaftap{
	
		@Test
		public void mergeLead01() throws InterruptedException {
		//click Leads link
				driver.findElementByLinkText("Leads").click();

				//click merge leads
				driver.findElementByLinkText("Merge Leads").click();

				//Click on Icon near From Lead
				driver.findElementByXPath("(//img[@alt='Lookup'])[1]").click();

				String firstWin = driver.getWindowHandle();

				//Move to new window
				Set<String> allwin = driver.getWindowHandles();
				
				System.out.println(allwin);

				for(String eachwin : allwin) {

					driver.switchTo().window(eachwin);
					System.out.println(driver.getTitle());
				}

				//Enter Lead ID
				driver.findElementByXPath("//input[@type='text']").sendKeys("10163");

				//click on Find Leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();

				Thread.sleep(3000);
				//Click First Resulting lead
				String elefirstName = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
				System.out.println(elefirstName);

				driver.findElementByXPath("(//a[@class='linktext'])[1]").click();



				//switching/back to parent window i.e. main/primary window
				driver.switchTo().window(firstWin);	//switch back to parent/primary window

				//Click on Icon near To Lead
				driver.findElementByXPath("(//img[@alt='Lookup'])[2]").click();

				//Move to new window
				Set<String> allwin1 = driver.getWindowHandles();
				System.out.println(allwin1);

				for(String eachwin1 : allwin1) {
					driver.switchTo().window(eachwin1);
					System.out.println(driver.getTitle());
				}

				//Enter Lead ID
				driver.findElementByXPath("//input[@type='text']").sendKeys("10161");

				//click on Find Leads button
				driver.findElementByXPath("//button[text()='Find Leads']").click();

				Thread.sleep(3000);
				//Click First Resulting lead
				String elefirstName1 = driver.findElementByXPath("(//a[@class='linktext'])[1]").getText();
				System.out.println(elefirstName1);

				driver.findElementByXPath("(//a[@class='linktext'])[1]").click();

				//switch back to primary window
				driver.switchTo().window(firstWin);	

				//click on merge
				driver.findElementByLinkText("Merge").click();

				//Accept Alert
				String alertMessage = driver.switchTo().alert().getText();
				System.out.println(alertMessage);

				driver.switchTo().alert().accept();

			}
	}
