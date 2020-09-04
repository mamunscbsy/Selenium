package learnAbstraction;

public class Test {
	
	public static void main(String[] args) {
		
		//we can't create object of Abstract class; but we can create reference variable of abstract class
		
		//MobileUser mu = new MobileUser();
		
		MobileUser mu; //reference variable of super class
		
		mu= new Rahim();
		mu.call();
		mu.sendMessage();
		
		mu= new Karim();
		mu.call();
		mu.sendMessage();
		
		
	}

}
