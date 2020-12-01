package javaDemo;

public class IfElse {

	public static void main(String[] args) {

		//1. if
		
		
		if(50<40) {
			System.out.println("50 is grater than 40");
		}
		
		if (30 > 25) {
			System.out.println("30 is greater than 25"); // obviously
		}
		
		System.out.println("..................................................");

		int x = 20;
		int y = 18;

		if (x > y) {
			System.out.println("x is greater than y");
		}

		System.out.println(".........................................");
		System.out.println("........................................");
		
		//2. if else
		
		// 20 > 18 > - greater than
	     // 18<20  < - less than
		
		
		if (x > y) {
			System.out.println("x is greater than y");

		} else {
			System.out.println("y is smaller than x");
		}

	}

}
