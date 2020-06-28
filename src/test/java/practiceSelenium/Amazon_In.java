package practiceSelenium;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon_In {

	private static WebElement price;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mamun\\Selenium\\Selenium\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();


		driver.get("https://www.amazon.in/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//enter "Oneplus 7 pro mobiles" in search box
		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("Oneplus 7 pro mobiles",Keys.ENTER);


		//print the price of first resulting image 

		String price = driver.findElementByXPath("(//span[@class='a-price-whole'])[1]").getText();

		//print price 
		System.out.println(price);

		//click on the mobile (1st resulting) image
		driver.findElementByXPath("//img[contains(@alt,'OnePlus 7 Pro (Mirror Grey, 8GB RAM, Flu')]").click();

		Thread.sleep(2000);

		//switch to the new window 
		Set<String> allwin = driver.getWindowHandles();
		System.out.println(allwin.size());

		for(String eachwin : allwin) {
			driver.switchTo().window(eachwin); 
			System.out.println(driver.getTitle());
		}

		Thread.sleep(2000);

		//Print rating
		String rating = driver.findElementById("acrCustomerReviewLink").getText();
		System.out.println(rating);

		//click on Add to cart
		driver.findElementByXPath("//input[@id='add-to-cart-button']").click(); 

		//confirm "Add to cart" text message appeared 
		//System.out.println(driver.getTitle());

		Thread.sleep(10000);
		//Confirm "Added to Cart" text message appeared 
		String AddedToCartText =  driver.findElementByXPath("(//h4[text()='Added to Cart'])[2]").getText();
		System.out.println("****************"+AddedToCartText);

		if(AddedToCartText.contains("Added")) {
			System.out.println("Text is Matched");

		}else { System.out.println("Not matched");

		} 

		Thread.sleep(3000);

		//  
		//driver.findElementByXPath("//a[@id='hlb-ptc-btn-native']").click();

		//Confirm the title is "Amazon Sign In"
		System.out.println(driver.getTitle());

		//Click continue (without entering mobile number/email)
		driver.findElementByXPath("//input[@id='continue']").click();

		//Verify the error message. Enter your email or mobile phone number
		String erroeMessage = driver.findElementByLinkText("(//div[@class='a-alert-content'])[2]").getText();
		System.out.println(erroeMessage);

		if(erroeMessage.contains("Enter")) {
		System.out.println("erroeMessage is matched");

		}else {
		System.out.println("Not matched");
		}

		//close both browser
		//driver.quit();



		//driver.findElem

	}


}


