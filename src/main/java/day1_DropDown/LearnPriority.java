package day1_DropDown;

import org.testng.annotations.Test;

public class LearnPriority {
	
	
	@Test(priority=2)
	public void test1() {
		System.out.println("test1");
	}
	@Test(priority=1)
	public void test2() {
		System.out.println("test2");
	}
	@Test(priority=0)
	public void test3() {
		System.out.println("test3");
	}
}
