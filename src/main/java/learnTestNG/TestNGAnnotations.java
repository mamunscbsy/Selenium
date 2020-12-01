package learnTestNG;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@BeforeSuite
	public void beforSuit() {
		System.out.println("BeforeSuit");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");
	}
		
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass");
	}
	
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod");
	}
	
	
	@Test(priority=1)
	public void test1() {
		System.out.println("Execute test1");
	}

	@Test(priority=0)
	public void test2() {
		System.out.println("Execute test2");
		
	}
	
	@Test(priority=2)
	public void test3() {
		System.out.println("Execute test3");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuit");
	}
}
